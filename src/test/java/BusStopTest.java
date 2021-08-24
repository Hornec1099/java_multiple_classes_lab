import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop testBusStop;
    Person testPerson;

    @Before
    public void before() {
        testBusStop = new BusStop("unknown");
        testPerson = new Person();
    }

    @Test
    public void canAddPersonToQueue(){
        testBusStop.addPersonToQueue(testPerson);
        assertEquals(1, testBusStop.queueCount());
    }

    @Test
    public void canRemovePersonFromQueue(){
        testBusStop.addPersonToQueue(testPerson);
        testBusStop.removePerson();
        assertEquals(0, testBusStop.queueCount());
    }
}
