package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Passenger John = new Passenger("John Johnson", "First");
        Passenger Frank = new Passenger("Frank James", "Business");
        Passenger James = new Passenger("James Bond", "Economy");
        Passenger Sully = new Passenger("Sully Sullenburger", "Hero");
        CargoFlight PanAm = new CargoFlight(23);
        PanAm.add1Package(2.0f,3.0f,5.0f);
        PanAm.add1Passenger(Sully);


        /*we can declare these instances and not worry about the specifics.
        * These objects will have access to all flight methods but not CargoFlight methods
        * because the squadron array is type Flight[]  */
        Flight[] squadron = new Flight[4];
        squadron[0] = new CargoFlight(0);
        squadron[1] = new Flight(1);
        squadron[2] = new CargoFlight(2);
        squadron[3] = new Flight(3);
    }
}
