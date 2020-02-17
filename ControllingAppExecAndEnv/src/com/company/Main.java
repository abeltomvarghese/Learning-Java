package com.company;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {

    public static void main(String[] args) {
	    if (args.length == 0) {
	        showUsage();
	        return;
        }
	    String filename = args[0];

	    if (!Files.exists(Paths.get(filename))) {
            System.out.println("File " + filename + " does not exist");
            return;
        }
	    showFileLines(filename);
    }

    public static void showFileLines(String filename) {
        System.out.println();

        try(BufferedReader br = Files.newBufferedReader(Paths.get(filename))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void showUsage() {
        System.out.println();
        System.out.println("Please provide the filename to process on the command line");
    }

}
