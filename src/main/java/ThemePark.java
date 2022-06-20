import attractions.Attraction;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<Stall> stalls;
    private ArrayList<Attraction> attractions;

    public ThemePark() {
        this.stalls = new ArrayList<>();
        this.attractions = new ArrayList<>();
    }

    public int getStallsCount() {
        return stalls.size();
    }

    public int getAttractionsCount() {
        return attractions.size();
    }

}
