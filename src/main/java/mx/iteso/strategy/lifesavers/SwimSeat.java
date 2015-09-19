package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Floatable;

public class SwimSeat extends Lifesaver {
    public SwimSeat() {
    	this.setType("Swim seats");
        this.setDeflateBehavior(new Deflatable());
        this.setFlotationBehavior(new Floatable());
    }
}
