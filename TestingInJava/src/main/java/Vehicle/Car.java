package Vehicle;

public class Car extends Transport{

    private String colour;


    public Car(String name, Category vehicleType, int tankSize) {
        super(name, vehicleType, tankSize);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void upgrade() {
        int currentTier = this.getTier();
        this.setTier(currentTier+2);
    }
}
