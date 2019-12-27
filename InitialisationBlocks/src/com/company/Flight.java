package com.company;

public class Flight {


    private int passengers, flightNumber, seats = 150;
    private char flightClass;
    private boolean[] isSeatAvailable;
    ///INITIALISATION BLOCKS GET EXECUTED BEFORE THE CONSTRUCTOR
    {
        isSeatAvailable = new boolean[seats];
        for (int i =0; i < seats; i++) {
            isSeatAvailable[i] = true;
        }
    }


    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
        this.flightClass = flightClass;
    }

    public char getFlightClass() {
        return flightClass;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void add1Passenger(Passenger passenger) {
        if (hasSeating(1)) {
            passengers += 1;
        }
    }

    public void addPassenger(Passenger... boardingList) {
        if (hasSeating(boardingList.length)) {
            passengers += boardingList.length;
        }
    }

    public boolean hasSeating (int numPassengers) {
        return numPassengers + passengers <= seats;
    }

    @Override
    public boolean equals (Object o) {
        //SHOW SUPER COMMAND
        if (super.equals(o)) {
            return true;
        } else if (!(o instanceof Flight)) {
            return false;
        } else {
            Flight other = (Flight) o;
            return flightNumber == other.getFlightNumber() && flightClass == other.getFlightClass();
        }
    }

    @Override
    public String toString() {
        String result;
        if (getFlightNumber() > 0) {
            result = "Flight number " + getFlightNumber();
        } else {
            result = "Flight Class " + getFlightClass();
        }
        return result;
    }
}
