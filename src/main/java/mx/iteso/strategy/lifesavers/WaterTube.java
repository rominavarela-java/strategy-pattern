package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.NotFloatable;

public class WaterTube extends Lifesaver {
    public WaterTube() {
    	this.setType("Water tubes");
        this.setDeflateBehavior(new NotDeflatable());
        this.setFlotationBehavior(new NotFloatable());
    }
}
