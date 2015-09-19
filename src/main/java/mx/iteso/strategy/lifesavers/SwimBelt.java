package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Floatable;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class SwimBelt extends Lifesaver {
    public SwimBelt() {
    	this.setType("Swim belts");
        this.setDeflateBehavior(new NotDeflatable());
        this.setFlotationBehavior(new Floatable());
    }
}
