import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;
    private HashMap<String, DiningRoom> diningRooms;


    public Hotel(String name){
        bedrooms = new ArrayList<Bedroom>();
        conferenceRooms = new ArrayList<ConferenceRoom>();
        this.name = name;
        this.bookings = new ArrayList<Booking>();
        this.diningRooms = new HashMap<String, DiningRoom>();
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, DiningRoom> getDiningRooms() {
        return diningRooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }
    public void addBedroom(Bedroom bedroom){
        bedrooms.add(bedroom);
    }
    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        conferenceRooms.add(conferenceRoom);
    }
    public int bedroomsCount(){
        return bedrooms.size();
    }
    public int conferenceRoomsCount(){
        return conferenceRooms.size();
    }
    public void checkInToBedroom(Guest guest, Bedroom bedroom){
        if(bedroom.guestCount() == 0) {
            int index = bedrooms.indexOf(bedroom);
            this.bedrooms.get(index).addGuest(guest);
        }
    }
    public Booking bookRoom(Bedroom bedroom, int nights){
        Booking reservation = new Booking(bedroom, nights);
        this.bookings.add(reservation);
        return reservation;
    }
    public int bookingsCount(){
        return this.bookings.size();
    }
    public int diningRoomsCount(){
        return  this.diningRooms.size();
    }
    public void addDinningRoom(DiningRoom diningRoom){
        String key = diningRoom.getName();
        diningRooms.put(key, diningRoom);
    }
    public ArrayList<Bedroom> vacantRooms(){
        ArrayList<Bedroom> result = new ArrayList<Bedroom>();
        for(Bedroom room: this.bedrooms) {
            if (room.guestCount() == 0) {
                result.add(room);
            }
        }
        return result;
    }
}
