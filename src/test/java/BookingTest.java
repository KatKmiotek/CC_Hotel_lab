import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    Booking booking;
    Bedroom bedroom;
    @Before
    public void before(){
        bedroom = new Bedroom(2,2, "double", 20);
        booking = new Booking(bedroom, 3);
    }
    @Test
    public void canHaveTotalBill(){
        assertEquals(60, booking.totalBill());
    }
}
