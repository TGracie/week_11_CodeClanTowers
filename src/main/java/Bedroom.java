import java.util.ArrayList;

public class Bedroom {
    private int number;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private int rate;

    public Bedroom(int number, int capacity, String type, int rate){
        this.number = number;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<>();
        this.rate = rate;
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

    public void checkOutGuest(Guest guest) {
        this.guests.remove(guest);
    }

    public int createBill(Booking booking){
        int bill = booking.getNights() * this.rate;
        return bill;
    }
}
