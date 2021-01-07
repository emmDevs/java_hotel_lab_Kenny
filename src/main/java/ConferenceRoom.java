import java.util.ArrayList;

public class ConferenceRoom {

    private RoomName roomName;
    private ArrayList<Guest> guestList;

    public ConferenceRoom(RoomName roomName){
        this.guestList = new ArrayList<Guest>();
        this.roomName = roomName;
    }


    public RoomName getName() {
        return roomName;
    }

    public int getCapacityFromEnum() {
        return this.roomName.getRoomCapacity();
    }

    public int guestCount() {
        return this.guestList.size();
    }


    public void addGuest(Guest guest) {
        if (getCapacityFromEnum() > guestCount()){
            this.guestList.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
        if (this.guestList.contains(guest)) {
            this.guestList.remove(guest);
        }
    }

    public void emptyRoom() {
        this.guestList.clear();
    }
}

