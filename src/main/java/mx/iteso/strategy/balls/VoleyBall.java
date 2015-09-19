package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;

public class VoleyBall extends Ball {
    public VoleyBall() {
    	this.setBounceBehavior(new IrregularBounce());
    	this.setDeflateBehavior(new Deflatable());
    	this.setType("Voley ball");
    }
}