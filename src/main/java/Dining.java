import java.util.ArrayList;

public class Dining {

    private int capacity;
    private String type;
    private ArrayList<Guest> guests;

    public Dining(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<>();
    }
}
