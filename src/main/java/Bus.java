import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){

        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int getPassengerCount(){
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (passengers.size() < capacity) {
            this.passengers.add(person);
        }
    }

    public void dropPassenger(Person person){
        this.passengers.remove(person);
    }

    public void pickUpPassenger(BusStop busStop){
        Person removedPerson = busStop.removePerson();
        this.addPassenger(removedPerson);
    }

}
