package com.company.Transport;

import java.util.Iterator;

public class FlightIterator implements Iterator<Person> {
    private int index = 0;
    private Crew[] crews;
    private Passenger[] roster;

    public FlightIterator(Crew[] crews1, Passenger[] roster1) {
        this.crews = crews1;
        this.roster = roster1;
    }

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
