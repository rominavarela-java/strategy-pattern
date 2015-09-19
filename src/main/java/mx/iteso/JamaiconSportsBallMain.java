package mx.iteso;

import java.util.ArrayList;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.AmericanFootballBall;
import mx.iteso.strategy.balls.BaseballBall;
import mx.iteso.strategy.balls.BolicheBall;
import mx.iteso.strategy.balls.CrystalBall;
import mx.iteso.strategy.balls.PlasticBall;
import mx.iteso.strategy.balls.SoccerBall;
import mx.iteso.strategy.balls.TenisBall;
import mx.iteso.strategy.balls.VoleyBall;

public class JamaiconSportsBallMain {
    public static void main (String[] args) {
    	
    	ArrayList<Ball> balls= new ArrayList<Ball>();
    	balls.add(new AmericanFootballBall());
    	balls.add(new BaseballBall());
    	balls.add(new BolicheBall());
    	balls.add(new CrystalBall());
    	balls.add(new PlasticBall());
    	balls.add(new SoccerBall());
    	balls.add(new TenisBall());
    	balls.add(new VoleyBall());
    	
    	for(Ball ball: balls)
    	{
    		System.out.println(ball.roll());
	        System.out.println(ball.getBounceBehavior().bounce());
	        System.out.println(ball.getDeflateBehavior().deflate());
	        System.out.println(ball.getDeflateBehavior().inflate());
	
	        System.out.println();
    	}
    }
}
