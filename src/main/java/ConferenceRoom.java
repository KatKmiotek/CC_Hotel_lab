import java.util.ArrayList;

public class ConferenceRoom {
    private int capacity;
    private ArrayList<Guest> guests;
    private String name;

    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }
    public int guestCount(){
        return guests.size();
    }
    public void addGuest(Guest guest){
        if(guestCount()< getCapacity()) {
            guests.add(guest);
        }
    }
    public Guest removeGuest(){
        return guests.remove(0);
    }
}
