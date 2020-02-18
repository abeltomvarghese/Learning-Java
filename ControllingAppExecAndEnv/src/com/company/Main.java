package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Properties;

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

        Properties props = new Properties();
        props.setProperty("name","Bruce Wayne");
        props.setProperty("vehicle","BatMobile 2.0");

        try (BufferedWriter br = Files.newBufferedWriter(Paths.get("superHero.properties"), StandardOpenOption.APPEND)) {
            props.store(br, "Gotham Portfolio");
        } catch (Exception e) {e.printStackTrace();}


        try(BufferedReader br = Files.newBufferedReader(Paths.get("superHero.properties"))) {
            props.load(br);
        } catch (Exception e) {e.printStackTrace();}

        String identity = props.getProperty("name");
        String transportation = props.getProperty("vehicle");
        String secretIdentity = props.getProperty("moniker", "Dark Knight");
        System.out.println(String.join(" ", "name", identity));
        System.out.println(String.join(" ", "car", transportation));
        System.out.println(String.join(" ", "Who?", secretIdentity));

        Properties props2 = new Properties();

        props2.setProperty("journalist","Clark Kent");
        props2.setProperty("vehicle","Taxi Cab");

        try(OutputStream outStream = Files.newOutputStream(Paths.get("heros.xml"))) {
            props2.storeToXML(outStream, " ");
        } catch(Exception e) {e.printStackTrace();}


        try(InputStream inStream = Files.newInputStream(Paths.get("heros.xml"))) {
            props2.loadFromXML(inStream);
        } catch (Exception e) {e.printStackTrace();}

        String reporter = props2.getProperty("journalist");
        String ride = props2.getProperty("vehicle");

        System.out.println(String.format("his name is %s and he rides a %s everyday",reporter,ride));




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
