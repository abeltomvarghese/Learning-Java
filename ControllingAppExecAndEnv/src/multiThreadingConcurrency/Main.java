package multiThreadingConcurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

    static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
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

        main3();
    }

    public static void main2 () {
        String[] inFiles = {"src/multiThreadingConcurrency/file.txt","src/multiThreadingConcurrency/file2.txt","src/multiThreadingConcurrency/file3.txt"};
        String[] outFiles = {"src/multiThreadingConcurrency/out.txt","src/multiThreadingConcurrency/out2.txt","src/multiThreadingConcurrency/out3.txt"};

        ExecutorService es = Executors.newFixedThreadPool(4);

        for (int i = 0; i < inFiles.length; i++) {
            Adder adder = new Adder(inFiles[i],outFiles[i]);
            es.submit(adder);
        }

        try {
            es.shutdown();
            es.awaitTermination(10, TimeUnit.SECONDS);
        } catch (Exception e) {e.printStackTrace();}


    }

    public static void main3() {

        logger.log(Level.INFO, "Entering Main3");
        String[] inFiles = {"src/multiThreadingConcurrency/file.txt","src/multiThreadingConcurrency/file2.txt","src/multiThreadingConcurrency/file3.txt"};

        ExecutorService es = Executors.newFixedThreadPool(4);
        Future<Integer>[] results = new Future[inFiles.length];

        for (int x=0; x<inFiles.length; x++) {

            AdderSecond adderSecond = new AdderSecond(inFiles[x]);
            results[x] = es.submit(adderSecond);
        }

        int value = 0;
        for (Future<Integer> result : results) {

            try {
                value += result.get();	//blocks each submit job until return value is available
                System.out.println(value);
            } catch(ExecutionException ex) {
                Throwable adderEx = ex.getCause();
                System.out.println(ex.getCause());
            } catch(Exception e) {
                System.out.println(e.getCause());
            }

        }

        System.out.println("Total: " + value);
        es.shutdown();
    }


}
