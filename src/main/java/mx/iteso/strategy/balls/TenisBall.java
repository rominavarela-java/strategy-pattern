package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class TenisBall extends Ball{
	public TenisBall(){
		this.setBounceBehavior(new NormalBounce());
    	this.setDeflateBehavior(new NotDeflatable());
    	this.setType("Tenis ball");
	}
}
