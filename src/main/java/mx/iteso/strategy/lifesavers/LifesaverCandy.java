package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.NotFloatable;

public class LifesaverCandy extends Lifesaver {
    public LifesaverCandy() {
    	this.setType("Lifesaver candies");
        this.setDeflateBehavior(new NotDeflatable());
        this.setFlotationBehavior(new NotFloatable());
    }
}
