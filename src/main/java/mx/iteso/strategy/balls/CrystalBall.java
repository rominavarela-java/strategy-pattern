package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Crash;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class CrystalBall extends Ball{
	public CrystalBall(){
		this.setBounceBehavior(new Crash());
		this.setDeflateBehavior(new NotDeflatable());
		this.setType("Crystal ball");
	}
}
