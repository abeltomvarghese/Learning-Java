package com.company;

public class CargoFlight extends Flight{
    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;

    public CargoFlight(int flightNumber) {
        super(flightNumber);
    }

    public CargoFlight(int flightNumber, float maxCargoSpace) {
        this(flightNumber);
        this.maxCargoSpace = maxCargoSpace;
    }

    public void add1Package(float h, float w, float d) {
        double size = h * w * d;
        if (hasCargoSpace((float) size)) {
            usedCargoSpace += size;
        } else {
            handleNoSpace();
        }
    }

    //ADDING FINAL TO A METHOD MEANS THAT THIS METHOD CANNOT BE OVERRIDEN IN DERIVED CLASS
    public final boolean hasCargoSpace(float size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }

    public void handleNoSpace() {
        System.out.println("No more space");
    }
}
