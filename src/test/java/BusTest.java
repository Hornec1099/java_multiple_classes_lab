import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus testBus;
    Person testGuy;
    BusStop testBusStop;

    @Before
    public void before() {
        testBus = new Bus("unknown", 10);
        testGuy = new Person();
        testBusStop = new BusStop("thebusstop");
    }

    @Test
    public void busHasPassengerCount(){
        assertEquals(0, testBus.getPassengerCount());
    }

    @Test
    public void busCanAddPassengers(){
        testBus.addPassenger(testGuy);
        assertEquals(1, testBus.getPassengerCount());
    }

    @Test
    public void busCantAddOverCapacity(){

        int i = 0;
        while (i < 13) {
            testBus.addPassenger(testGuy);
            i+= 1;
        }
        assertEquals(10, testBus.getPassengerCount());
    }

    @Test
    public void busCanRemovePassenger(){
        testBus.addPassenger(testGuy);
        testBus.dropPassenger(testGuy);
        assertEquals(0, testBus.getPassengerCount());
    }

    @Test
    public void busCanPickUpFromBusStop(){
        testBusStop.addPersonToQueue(testGuy);
        testBus.pickUpPassenger(testBusStop);
        assertEquals(1, testBus.getPassengerCount());
        assertEquals(0, testBusStop.queueCount());
    }
}
