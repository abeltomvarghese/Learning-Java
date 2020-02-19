package multiThreadingConcurrency;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Adder implements Runnable {

    private String inFile, outFile;

    public Adder(String infile, String outfile) {
        this.inFile = infile;
        this.outFile = outfile;
    }

    public void doAdd() throws IOException {

        int total = 0;
        String line;
        try(BufferedReader br = Files.newBufferedReader(Paths.get(inFile))) {
            while((line = br.readLine()) != null) {
                total += Integer.parseInt(line);
            }
        }

        try(BufferedWriter bw = Files.newBufferedWriter(Paths.get(outFile))) {
            bw.write("total: " + total);
        }
    }

    public void run() {
        try {
            doAdd();
        } catch (Exception e) {e.printStackTrace();}
    }



}
