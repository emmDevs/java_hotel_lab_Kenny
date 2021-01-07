import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    
    Guest guest;
    
    @Before
    public void setUp(){
        guest = new Guest("Betty Davis");
    }

    @Test
    public void guestHasName(){
        assertEquals("Betty Davis", guest.getName());
    }


}
