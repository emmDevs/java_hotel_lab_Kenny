import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void setUp(){
        conferenceRoom = new ConferenceRoom(RoomName.EARN);
        guest = new Guest("Betty Davis");
        guest1 = new Guest("Charlie Bucket");
        guest2 = new Guest("Dwayne Johnson");

    }

    @Test
    public void canGetName(){
        assertEquals(RoomName.EARN, conferenceRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, conferenceRoom.getCapacityFromEnum());
    }

    @Test
    public void checkCurrentGuestCount(){
        assertEquals(0, conferenceRoom.guestCount());
    }

//    can only add if under capacity
    @Test
    public void canAddGuest__underCapacity(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void cantAddGuest__atCapacity(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        assertEquals(2, conferenceRoom.guestCount());
    }


    @Test
    public void canRemoveGuest(){
        conferenceRoom.addGuest(guest1);
        conferenceRoom.removeGuest(guest1);
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void canEmptyRoom(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest1);
        conferenceRoom.emptyRoom();
        assertEquals(0, conferenceRoom.guestCount());
    }








}
