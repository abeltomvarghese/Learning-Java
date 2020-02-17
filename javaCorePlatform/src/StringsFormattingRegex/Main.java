package StringsFormattingRegex;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("], [","[", "]");
        sj.add("hello");
        sj.add("central");
        sj.add("perk");
        String result = sj.toString();
        System.out.println(result);

        try {
            doWrite(23, 44);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("world");

        String[] myArray = list1.toArray(new String[0]);

        for (String s : myArray) {
            System.out.println(s);
        }
        list1.forEach(l -> System.out.println(l));
    }

    public static void doWrite(int s1, int s2) throws IOException {
        BufferedWriter writer = Files.newBufferedWriter(Paths.get("formattedFileTest.txt"), StandardOpenOption.APPEND);
        try (Formatter f = new Formatter(writer)) {
            f.format("the ages are %d & %d of the cars", s1, s2);
            f.format("%n");
            f.format("The car is only %d years old", s1);

        }
    }


}
