import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Function> functions;
    private ArrayList<Dining> dining;

    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.functions = new ArrayList<>();
        this.dining = new ArrayList<>();
    }

}
