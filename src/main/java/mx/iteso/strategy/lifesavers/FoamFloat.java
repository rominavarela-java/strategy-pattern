package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Floatable;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class FoamFloat extends Lifesaver {
    public FoamFloat() {
    	this.setType("Foam floats");
        this.setDeflateBehavior(new NotDeflatable());
        this.setFlotationBehavior(new Floatable());
    }
}
