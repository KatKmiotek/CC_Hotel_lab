import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom;
    Bedroom bedroom1;
    ConferenceRoom conferenceRoom;
    Guest guest;
    Booking booking;
    DiningRoom diningRoom;

    @Before
    public void before(){
        bedroom = new Bedroom(1, 2, "double", 20);
        bedroom1 = new Bedroom(1, 2, "double", 20);
        conferenceRoom = new ConferenceRoom(5, "Boardroom");
        guest = new Guest("Luke");
        hotel = new Hotel("Hilton");
        diningRoom = new DiningRoom("restaurant");
    }
    @Test
    public void hotelExist(){
        assertEquals("Hilton", hotel.getName());
        assertEquals(0, hotel.bedroomsCount());
        assertEquals(0, hotel.conferenceRoomsCount());
    }
    @Test
    public void canCheckIn(){
        hotel.addBedroom(bedroom);
        hotel.checkInToBedroom(guest, bedroom);
        assertEquals(1, bedroom.guestCount());
    }
    @Test
    public void canBookRoom(){
        hotel.bookRoom(bedroom, 3);
        assertEquals(1, hotel.bookingsCount());
    }
    @Test
    public void hasDiningRooms(){
        assertEquals(0, hotel.diningRoomsCount());
    }
    @Test
    public void addsDinningRoom(){
        hotel.addDinningRoom(diningRoom);
        System.out.println(hotel.getDiningRooms());
        assertEquals(1, hotel.diningRoomsCount());
    }
    @Test
    public void canFindVacantRooms(){
        hotel.addBedroom(bedroom);
        hotel.checkInToBedroom(guest, bedroom);
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.vacantRooms().size());
    }
    @Test
    public void cantCheckIn(){
        hotel.addBedroom(bedroom);
        hotel.checkInToBedroom(guest, bedroom);
        hotel.checkInToBedroom(guest, bedroom);
        assertEquals(1, bedroom.guestCount());
    }
}
