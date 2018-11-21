import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom room1;
    Bedroom room2;
    Function roomA;
    Function roomB;
    Dining cafe;
    Dining bistro;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        hotel = new Hotel("Marriott");
        room1 = new Bedroom(1, 2, "Double");
        room2 = new Bedroom(2, 1, "Single");
        roomA = new Function(3, "A");
        roomB = new Function(5, "B");
        cafe = new Dining(5, "Cafe");
        bistro = new Dining(10, "Bistro");
        guest1 = new Guest("Thomas");
        guest2 = new Guest("Oksana");
    }

    @Test
    public void hotelHasRooms(){
        hotel.addBedroom(room1);
        hotel.addBedroom(room2);
        hotel.addFunctionRoom(roomA);
        hotel.addFunctionRoom(roomB);
        hotel.addDiningRoom(cafe);
        hotel.addDiningRoom(bistro);
        assertEquals(6, hotel.totalRooms());
    }

    @Test
    public void checkGuestIn(){
        hotel.checkIn(guest1, bistro);
        assertEquals(1, bistro.guestCount());

    }

    @Test
    public void checkGuestInBedroom(){
        hotel.checkIn(guest1, room1);
        assertEquals(1, room1.guestCount());
    }

    @Test
    public void checkGuestInFunction(){
        hotel.checkIn(guest1, roomA);
        assertEquals(1, roomA.guestCount());
    }

}
