package com.company.Transport;

public class Flight implements Comparable<Flight> {
    private int flightTime;

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
}
