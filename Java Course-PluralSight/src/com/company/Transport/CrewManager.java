package com.company.Transport;

import java.io.BufferedReader;
import java.io.FileReader;

public class CrewManager {
    private final static String FILENAME= "members.txt";

    private static CrewMember[] pool;

    static {
        pool = new CrewMember[10];
        int index = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILENAME))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] cv = line.split(",");
                FlightCrewJob flightCrewJob = FlightCrewJob.valueOf(cv[0]);
                pool[index] = new CrewMember(cv[1],flightCrewJob);
                index++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }




    public static CrewMember findAvailable(FlightCrewJob job) {
        CrewMember cm = null;

        for (int i =0;i < pool.length;i++) {
            if (pool[i] != null && pool[i].getJob().equals(job)){
                cm = pool[i];
                pool[i] = null;
                break;
            }
        }

        return cm;
    }

}
