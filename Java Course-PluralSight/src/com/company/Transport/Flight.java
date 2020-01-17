package com.company.Transport;

import java.util.Iterator;

public class Flight implements Comparable<Flight>, Iterable<Person> {
    private int flightTime;
    private Passenger[] roster;
    private Crew[] crews;
    private int pIndex = 0;
    private int cIndex = 0;
    private static int allPassengers;



    {
        crews = new Crew[2];
        roster = new Passenger[2];
        allPassengers = 0;
    }


    @Override
    public int compareTo(Flight f) {
        return this.flightTime - f.flightTime;

    }

    public String getInfo() {
        return String.join(" ", Integer.toString(this.flightTime));
    }

    public void setFlightTime(int flightTime) {
        this.flightTime = flightTime;
    }

    @Override
    public Iterator<Person> iterator() {
        return new FlightIterator();
    }

    public void addCrewMember(Crew member) {
        if (cIndex < crews.length) {
            crews[cIndex] = member;
        }
        cIndex++;
    }

    public void addPassenger(Passenger member) {
        if (pIndex < roster.length) {
            roster[pIndex] = member;
        }
        pIndex++;
    }

    public static int getAllPassengers() {
        return allPassengers;
    }

    public static void addPassengers(int i) {
        allPassengers+= i;
    }


    private class FlightIterator implements Iterator<Person> {
        private int index = 0;


        @Override
        public boolean hasNext() {
            return index < (crews.length + roster.length);
        }

        @Override
        public Person next() {

            Person p = (index < crews.length) ? crews[index] : roster[index - crews.length];
            index++;
            return p;
        }
    }



}
