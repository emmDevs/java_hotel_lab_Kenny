public enum RoomName {

    TILT(2),
    EARN(2),
    LOMOND(3);


    private final int capacity;

    RoomName(int capacity){
        this.capacity = capacity;
    }

    public int getRoomCapacity() {
        return capacity;
    }

}
