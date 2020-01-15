package com.company;

import com.company.Transport.Crew;
import com.company.Transport.Flight;
import com.company.Transport.Passenger;
import com.company.Transport.Person;
import com.sun.tools.jconsole.JConsoleContext;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

///TO STOP USING Flight class to access its static methods, we can use the static import
import static com.company.Transport.Flight.addPassengers;
import static com.company.Transport.Flight.getAllPassengers;


public class Main {

    public static void main(String[] args) {
        System.out.println("**** USING BUFFEREDREADER TO READ FROM FILES ****");
        ReadFiler readFiler = new ReadFiler();
        readFiler.readFile();

        System.out.println("**** COMPARABLE ****");

        Passenger bob = new Passenger("Bob");
        bob.setLevelDays(1,180);

        Passenger jane = new Passenger("Jane");
        jane.setLevelDays(1,90);

        Passenger steve = new Passenger("Steve");
        steve.setLevelDays(2,180);

        Passenger lisa = new Passenger("Lisa");
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

        System.out.println("**** INTERFACES ****");
        Crew jack = new Crew("Jack",10);
        Crew sulley = new Crew("Sulley",30);
        lax.addPassenger(bob);
        lax.addPassenger(steve);
        lax.addCrewMember(jack);
        lax.addCrewMember(sulley);
        for (Person p:lax) {
            System.out.println(p.getName());
        }

        addPassengers(20);
        System.out.println(getAllPassengers());
    }


}
