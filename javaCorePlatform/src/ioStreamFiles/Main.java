package ioStreamFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader("inputFile.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("outputFile.txt",true))) {

            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
                writer.append(currentLine);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // using Paths

        try(BufferedReader br = Files.newBufferedReader(Paths.get("src\\ioStreamFiles\\inputFile.txt"))) {
            String inValue;

            while ((inValue = br.readLine()) != null) {
                System.out.println(inValue);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //// Reading all the lines in a file
        List<String> lines = Files.readAllLines(Paths.get("src/ioStreamFiles/inputFile2.txt"));

        for (String line : lines) {
            System.out.println(line);
        }

        try (FileSystem fs = openZip(Paths.get("myZip.zip"))) {
            copyToZip(fs);
            writeToZip(fs);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getCause()+ " - " + e.getMessage());
        }
    }

    public static FileSystem openZip(Path zipPath) throws IOException, URISyntaxException {
        Map<String, String> providerProps = new HashMap<>();
        providerProps.put("create","true");
        URI fileURI = new URI("jar:file", zipPath.toUri().getPath(), null);
        FileSystem fs = FileSystems.newFileSystem(fileURI, providerProps);

        return fs;
    }

    public static void copyToZip(FileSystem zipFS) throws Exception {
        Path sourceFile = Paths.get("inputFile2.txt");
        Path destFile = zipFS.getPath("/copiedFile.txt");
        Files.copy(sourceFile, destFile, StandardCopyOption.REPLACE_EXISTING);
    }

    public static void writeToZip(FileSystem zipFS) throws Exception {
        String[] data = {"The name is ", "Bond,", "James Bond", "License to stun"};
        try(BufferedWriter bw = Files.newBufferedWriter(zipFS.getPath("/writtenFile.txt"), StandardCharsets.UTF_8, StandardOpenOption.APPEND)) {
            for (String s : data) {
                bw.write(s);
                bw.newLine();
            }
        }
    }

}
