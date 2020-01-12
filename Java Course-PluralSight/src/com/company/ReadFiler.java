package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiler {
    //BufferedReader bufferedReader = null;
    int total = 0;
    public void readFile() {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("numbers.txt"))) {
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                total += Integer.valueOf(line);
                System.out.println("Total: " + total);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }




        /*
        try {
            bufferedReader = new BufferedReader(new FileReader("numbers.txt"));
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                total += Integer.valueOf(line);
                System.out.println("Total: " + total);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

        }
       */
    }
}
