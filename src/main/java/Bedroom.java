import java.util.ArrayList;

public class Bedroom {

    private RoomNumber roomNumber;
    private ArrayList<Guest> guestList;

    public Bedroom(RoomNumber roomNumber){
        this.guestList = new ArrayList<Guest>();
        this.roomNumber = roomNumber;
    }


    public RoomNumber getNumber() {
        return roomNumber;
    }

    public int getCapacityFromEnum() {
        return this.roomNumber.getRoomCapacity();
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
