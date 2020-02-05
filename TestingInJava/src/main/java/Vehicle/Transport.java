package Vehicle;

public class Transport {

    private String name;
    private Category vehicleType;
    private int fuelLevel;
    private int tankSize;
    private int tier;

    public Transport(String name, Category vehicleType, int tankSize) {
        this.name = name;
        this.vehicleType = vehicleType;
        this.tankSize = tankSize;
        this.fuelLevel = 0;
        this.tier = 0;
    }

    public int pumpFuel(int amountToAdd) {
        return fuelLevel + amountToAdd <= tankSize ? fuelLevel+= amountToAdd : fuelLevel;
    }

    public String getName() {
        return name;
    }

    public Category getVehicleType() {
        return vehicleType;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public int getTankSize() {
        return tankSize;
    }

    public void upgrade() {
        this.tier++;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }
}
