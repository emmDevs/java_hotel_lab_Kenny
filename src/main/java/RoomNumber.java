public enum RoomNumber {

    ONE(2),
    TWO(2),
    THREE(4);


    private final int capacity;

    RoomNumber(int capacity){
            this.capacity = capacity;
        }

        public int getRoomCapacity() {
            return capacity;
        }

    }

