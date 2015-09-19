package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;

public class AmericanFootballBall extends Ball {
    public AmericanFootballBall() {
    	this.setBounceBehavior(new IrregularBounce());
    	this.setDeflateBehavior(new Deflatable());
    	this.setType("American Football ball");
    }
}
