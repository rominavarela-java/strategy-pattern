package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class BaseballBall extends Ball {
    public BaseballBall() {
    	this.setBounceBehavior(new IrregularBounce());
    	this.setDeflateBehavior(new NotDeflatable());
    	this.setType("Baseball ball");
    }
}
