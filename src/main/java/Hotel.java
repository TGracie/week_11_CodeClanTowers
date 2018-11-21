import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Function> functions;
    private ArrayList<Dining> dining;
    private ArrayList<Booking> bookings;

    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.functions = new ArrayList<>();
        this.dining = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public void addBedroom(Bedroom room) {
        this.bedrooms.add(room);
    }

    public void addFunctionRoom(Function room) {
        this.functions.add(room);
    }

    public void addDiningRoom(Dining dining) {
        this.dining.add(dining);
    }

    public int totalRooms() {
        int total = 0;
        total += this.bedrooms.size();
        total += this.functions.size();
        total += this.dining.size();

        return total;
    }

    public void checkIn(Guest guest, Dining dining) {
        dining.addGuest(guest);
    }

    public void checkIn(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }

    public void checkIn(Guest guest, Function function) {
        function.addGuest(guest);
    }

    public Booking bookRoom(Bedroom room, int numberOfNights) {
        Booking newBooking = new Booking(room, numberOfNights);
        this.bookings.add(newBooking);
        return newBooking;
    }


    public int bookingCount() {
        return this.bookings.size();
    }
}
