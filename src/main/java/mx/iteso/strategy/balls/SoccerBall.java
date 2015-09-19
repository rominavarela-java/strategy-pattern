package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;

public class SoccerBall extends Ball {
    public SoccerBall() {
    	this.setBounceBehavior(new NormalBounce());
    	this.setDeflateBehavior(new Deflatable());
    	this.setType("Soccer ball");
    }
}
