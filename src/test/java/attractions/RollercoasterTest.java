package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor6;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor2 = new Visitor(16,170.00,20.00);
        visitor3 = new Visitor(25,183.00,500.00);
        visitor6 = new Visitor(19,203.00,200.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.00);
    }

    @Test
    public void visitorMustBeOver12And145Cm(){
        assertEquals(true, rollerCoaster.isAllowed(visitor3));
    }

    @Test
    public void defaultTicketPriceForUnder200Cm(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor2), 0.0);
    }
    @Test
    public void doubleTicketPriceForOver200Cm(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor6), 0.0);
    }

}
