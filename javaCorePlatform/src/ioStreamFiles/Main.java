package ioStreamFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Main {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("inputFile.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("outputFile.txt",true))) {

            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
                writer.append(currentLine);
                writer.append("\n");
            }
        } catch (IOException e) {

        }
    }
}
