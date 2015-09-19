package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;

public class PlasticBall extends Ball{
	public PlasticBall(){
		this.setBounceBehavior(new NormalBounce());
    	this.setDeflateBehavior(new Deflatable());
    	this.setType("Plastic ball");
	}
}
