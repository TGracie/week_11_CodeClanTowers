import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom room1;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        room1 = new Bedroom(1, 1, "Double");
        guest1 = new Guest("Thomas");
        guest2 = new Guest("Oksana");


    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, room1.guestCount());
    }

    @Test
    public void addGuestToRoom(){
        room1.addGuest(guest1);
        assertEquals(1, room1.guestCount());
    }

    @Test
    public void canCheckOutGuest(){
        room1.addGuest(guest2);
        room1.checkOutGuest(guest2);
        assertEquals(0, room1.guestCount());
    }

    @Test
    public void roomFull(){
        room1.addGuest(guest1);
        room1.addGuest(guest1);
        assertEquals(1, room1.guestCount());
    }
}
