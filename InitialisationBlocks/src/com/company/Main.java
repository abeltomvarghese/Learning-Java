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

        Object o = new CargoFlight(241);

        if (o instanceof CargoFlight) {
            CargoFlight cf = (CargoFlight) o;
            cf.add1Passenger(new Passenger("Abe", "private"));
        }


        ///CODE TO SHOW THE USE OF SUPER COMMAND

        Flight boeing = new Flight(787);
        Flight airbus = boeing;

        Flight antonov = new Flight('R');
        System.out.println(antonov);


        //USING STRINGBUILDER
        StringBuilder stringBuilder = new StringBuilder(40);
        String destination = "New York";
        stringBuilder.append("I flew to ");
        stringBuilder.append(destination);
        stringBuilder.append(" on ");
        stringBuilder.append(antonov);
        int time = 9;
        int pos = stringBuilder.length() - " on ".length() - antonov.toString().length();
        stringBuilder.insert(pos," at ");
        stringBuilder.insert(pos + 4, time);
        String output = stringBuilder.toString();
        System.out.println(output);
    }
}
