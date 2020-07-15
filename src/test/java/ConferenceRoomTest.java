import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;
    Guest guest;
    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(5, "Boardroom");
        guest = new Guest("Luke");
    }
    @Test
    public void conferenceRoomExists(){
        assertEquals(5, conferenceRoom.getCapacity());
        assertEquals("Boardroom", conferenceRoom.getName());
        assertEquals(0, conferenceRoom.guestCount());
    }
    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.guestCount());
    }
    @Test
    public void canRemoveGuest(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest();
        assertEquals(0, conferenceRoom.guestCount());
    }
}
