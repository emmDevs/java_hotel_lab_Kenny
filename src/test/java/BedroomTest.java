import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void setUp(){
        bedroom = new Bedroom(RoomNumber.ONE);
        guest = new Guest("Betty Davis");
        guest1 = new Guest("Charlie Bucket");
        guest2 = new Guest("Dwayne Johnson");

    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(RoomNumber.ONE, bedroom.getNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacityFromEnum());
    }

    @Test
    public void checkCurrentGuestCount(){
        assertEquals(0, bedroom.guestCount());
    }

    //    can only add if under capacity
    @Test
    public void canAddGuest__underCapacity(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void cantAddGuest__atCapacity(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        assertEquals(2, bedroom.guestCount());
    }


    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest1);
        bedroom.removeGuest(guest1);
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void canEmptyRoom(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest1);
        bedroom.emptyRoom();
        assertEquals(0, bedroom.guestCount());
    }








}
