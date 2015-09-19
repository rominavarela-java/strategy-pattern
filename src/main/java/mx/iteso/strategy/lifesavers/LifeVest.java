package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Floatable;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class LifeVest extends Lifesaver {
    public LifeVest() {
    	this.setType("Life vests");
        this.setDeflateBehavior(new NotDeflatable());
        this.setFlotationBehavior(new Floatable());
    }
}
