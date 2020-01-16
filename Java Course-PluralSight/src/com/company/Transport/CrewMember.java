package com.company.Transport;

public class CrewMember extends Person{
        private FlightCrewJob job;
    public CrewMember(String name, FlightCrewJob job) {
        super(name);
        this.job = job;
    }
    public FlightCrewJob getJob() {
        return this.job;
    }

    @Override
    public String toString() {
        return getName();
    }
}
