package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.KillerBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class BolicheBall extends Ball{
	public BolicheBall(){
        this.setBounceBehavior(new KillerBounce());
    	this.setDeflateBehavior(new NotDeflatable());
    	this.setType("Boliche ball");
	}
}