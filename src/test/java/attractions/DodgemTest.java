package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor2;
    Visitor visitor4;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor2 = new Visitor(16,170.00,20.00);
        visitor4 = new Visitor(11,145.00,10.00);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void normalTicketPriceForOver12s(){
        assertEquals(4.50, dodgems.priceFor(visitor2), 0.0);
    }
    @Test
    public void halfTicketPriceForUnder12s(){
        assertEquals(2.25, dodgems.priceFor(visitor4), 0.0);
    }

}
