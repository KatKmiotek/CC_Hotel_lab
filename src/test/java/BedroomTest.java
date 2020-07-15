import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(1,2,"double", 20);
        guest = new Guest("Luke");
    }

    @Test
    public void roomExists(){
        assertEquals(1, bedroom.getRoomNumber());
        assertEquals(2, bedroom.getCapacity());
        assertEquals("double", bedroom.getRoomType());
        assertEquals(0, bedroom.guestCount());
        assertEquals(20, bedroom.getNightRate());
    }
    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.guestCount());
    }
    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest);
        bedroom.removeGuest();
        assertEquals(0, bedroom.guestCount());
    }
}
