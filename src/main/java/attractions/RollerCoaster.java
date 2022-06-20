package attractions;

import behaviours.IReviewed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements IReviewed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowed(Visitor visitor) {
        return visitor.getAge() >= 12 && visitor.getHeight() >= 145.00;
    }

    public double defaultPrice(){
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        return visitor.getHeight() < 200.00 ? defaultPrice() : defaultPrice()*2;
    }


}
