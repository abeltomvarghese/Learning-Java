package ioStreamFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

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





    }
}
