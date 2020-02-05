package Vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportTest {

    private Transport testTransport;

    @BeforeEach
    public void before() {
        testTransport = new Transport("vehicle1",Category.BUS,100);
    }

    private void initTransport() {
        testTransport.setTier(0);
        testTransport.pumpFuel(50);
    }

    @Test
    public void canCreateTransport() {
        initTransport();

        assertEquals("vehicle1",testTransport.getName(),"wrong name");
    }

    @Test
    public void canPumpFuel() {
        initTransport();
        testTransport.pumpFuel(10);
        assertEquals(60, testTransport.getFuelLevel(), "wrong amount of fuel");
        testTransport.pumpFuel(10);
        assertEquals(70, testTransport.getFuelLevel(), "wrong amount of fuel");
    }
}