package multiThreadingConcurrency;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.Callable;

public class AdderSecond implements Callable<Integer> {

    String inFile;

    public AdderSecond(String infile) {this.inFile = infile;}

    public int doAdd() throws IOException {

        int total = 0;
        String line = null;

        try(BufferedReader br = Files.newBufferedReader(Paths.get(inFile))) {

            while ((line = br.readLine()) != null) {
                total += Integer.parseInt(line);
            }
        }
        return total;
    }

    public Integer call() throws IOException {
        return doAdd();
    }

}
