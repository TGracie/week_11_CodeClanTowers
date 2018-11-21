import java.util.ArrayList;

public class Bedroom {
    private int number;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;

    public Bedroom(int number, int capacity, String type){
        this.number = number;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<>();
    }

    public int guestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        if(this.guestCount() < this.capacity) {
            this.guests.add(guest);
        }else{
            System.out.println("Sorry room full");
        }
    }
}
