package com.company;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Main {

    private static HttpClient client;
    public static void main(String[] args) throws IOException {

        client = HttpClient.newHttpClient();

        var futures = Files.lines(Path.of("urls.txt"))
                .map(Main::validateLink)
                .collect(Collectors.toList());

        futures.stream()
                .map(CompletableFuture::join)
                .forEach(System.out::println);

        
    }

    public static CompletableFuture<String> validateLink(String link) {
        HttpRequest request = HttpRequest.newBuilder(URI.create(link)).GET().build();

        /*try {
            HttpResponse<Void> response = client.send(request,HttpResponse.BodyHandlers.discarding());
            return responseToString(response);
        } catch (IOException | InterruptedException e) {
            return String.format("%s -> %s", link,false);
        }*/

        return client.sendAsync(request,HttpResponse.BodyHandlers.discarding())
                .thenApply(Main::responseToString)
                .exceptionally(e -> String.format("%s -> %s", link,false));

    }

    public static String responseToString(HttpResponse<Void> response ) {
        int status = response.statusCode();
        boolean success = status >= 200 && status <= 299;
        return String.format("%s -> %s (status: %s)", response.uri(),success, status);
    }
}
