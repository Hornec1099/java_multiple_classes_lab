import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public void addPersonToQueue(Person person){
        this.queue.add(person);
    }

    public int queueCount(){
        return this.queue.size();
    }

    public Person removePerson(){
        return this.queue.remove(0);
    }
}
