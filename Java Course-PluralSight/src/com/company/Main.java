package com.company;

import com.company.Transport.Flight;
import com.company.Transport.Passenger;
import com.sun.tools.jconsole.JConsoleContext;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ReadFiler readFiler = new ReadFiler();
        readFiler.readFile();

        Passenger bob = new Passenger();
        bob.setLevelDays(1,180);

        Passenger jane = new Passenger();
        jane.setLevelDays(1,90);

        Passenger steve = new Passenger();
        steve.setLevelDays(2,180);

        Passenger lisa = new Passenger();
        lisa.setLevelDays(3,730);

        Passenger[] passengers = {bob, jane, steve, lisa};

        Arrays.sort(passengers);

        for (Passenger individual : passengers) {
            System.out.println(individual.getInfo());
        }


        Flight lax = new Flight();
        lax.setFlightTime(25);

        Flight nyc = new Flight();
        nyc.setFlightTime(75);

        Flight lhr = new Flight();
        lhr.setFlightTime(100);

        Flight cok = new Flight();
        cok.setFlightTime(26);

        Flight[] flights = {lax, nyc, lhr, cok};
        Arrays.sort(flights);
        for (Flight plane : flights) {
            System.out.println(plane.getInfo());
        }

    }


}
