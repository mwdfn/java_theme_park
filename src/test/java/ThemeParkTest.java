import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    @Before
    public void before(){
        themePark = new ThemePark();
    }

    @Test
    public void hasNoStalls(){
        assertEquals(0, themePark.getStallsCount());
    }

    @Test
    public void hasNoAttractions(){
        assertEquals(0, themePark.getAttractionsCount());
    }
}
