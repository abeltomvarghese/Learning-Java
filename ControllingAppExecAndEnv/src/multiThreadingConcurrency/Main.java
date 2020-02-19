package multiThreadingConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        String[] inFiles = {"src/multiThreadingConcurrency/file.txt","src/multiThreadingConcurrency/file2.txt","src/multiThreadingConcurrency/file3.txt"};
        String[] outFiles = {"src/multiThreadingConcurrency/out.txt","src/multiThreadingConcurrency/out2.txt","src/multiThreadingConcurrency/out3.txt"};

        Thread threads[] = new Thread[inFiles.length];

        for (int i = 0; i < inFiles.length; i++) {
            Adder adder = new Adder(inFiles[i],outFiles[i]);
            threads[i] = new Thread(adder);
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (Exception e) {e.printStackTrace();}

        }
    }

    public static void main2 () {
        String[] inFiles = {"src/multiThreadingConcurrency/file.txt","src/multiThreadingConcurrency/file2.txt","src/multiThreadingConcurrency/file3.txt"};
        String[] outFiles = {"src/multiThreadingConcurrency/out.txt","src/multiThreadingConcurrency/out2.txt","src/multiThreadingConcurrency/out3.txt"};

        ExecutorService es = Executors.newFixedThreadPool(4);

        for (int i = 0; i < inFiles.length; i++) {
            Adder adder = new Adder(inFiles[i],outFiles[i]);
            es.submit(adder)
        }

        try {
            es.shutdown();
            es.awaitTermination(10, TimeUnit.SECONDS);
        } catch (Exception e) {e.printStackTrace();}


    }


}
