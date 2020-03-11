package com.company;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ReceivingData {

    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create("https://jsonplaceholder.typicode.com/photos")).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).thenApply(ReceivingData::parse).join();


    }

    public static String parse(String responseBody) {
        JSONArray albums = new JSONArray(responseBody);
        for (int index = 0; index < albums.length();index++) {
            JSONObject object = albums.getJSONObject(index);
            String title = object.getString("title");
            System.out.println(title);
        }
       return null;
    }
}
