package Collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>(new MyComparator());

        map.put(2015, "Range Rover");
        map.put(2013, "Bentley");
        map.put(2012, "Rolls Royce");
        map.put(2014, "Jaguar");
        map.put(2011, "Audi");
        map.put(2009, "BMW");
        map.put(2010, "Mercedes");

        map.forEach((k,v) -> System.out.println(k + " | " + v));

        System.out.println("HeadMap");
        SortedMap<Integer, String> hMap = map.headMap(2012);
        hMap.forEach((k,v) -> System.out.println(k + " | " + v));

        System.out.println("TailMap");
        SortedMap<Integer, String> tMap = map.tailMap(2012);
        tMap.forEach((k,v) -> System.out.println(k + " | " + v));
    }

}
