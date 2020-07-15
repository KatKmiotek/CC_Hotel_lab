import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String roomType;
    private int nightRate;

    public Bedroom(int roomNumber, int capacity, String roomType, int nightRate){
        this.capacity = capacity;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.guests = new ArrayList<Guest>();
        this.nightRate = nightRate;
    }

    public int getNightRate() {
        return nightRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getRoomType() {
        return roomType;
    }

    public int guestCount(){
        return this.guests.size();
    }
    public void addGuest(Guest guest){
        if(guestCount() < getCapacity()) {
            guests.add(guest);
        }
    }
    public Guest removeGuest(){
        return guests.remove(0);
    }
}
