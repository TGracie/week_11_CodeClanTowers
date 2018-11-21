import java.util.ArrayList;

public class Function {
    private int capacity;
    private String name;
    private String type;
    private ArrayList<Guest> guests;

    public Function(int capacity, String name, String type) {

        this.capacity = capacity;
        this.name = name;
        this.type = type;
        this.guests = new ArrayList<>();
    }
}
