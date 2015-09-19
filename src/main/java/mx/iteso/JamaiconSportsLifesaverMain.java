package mx.iteso;

import java.util.ArrayList;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.lifesavers.ArmBands;
import mx.iteso.strategy.lifesavers.FoamFloat;
import mx.iteso.strategy.lifesavers.LifeVest;
import mx.iteso.strategy.lifesavers.LifesaverCandy;
import mx.iteso.strategy.lifesavers.SwimBelt;
import mx.iteso.strategy.lifesavers.SwimRing;
import mx.iteso.strategy.lifesavers.SwimSeat;
import mx.iteso.strategy.lifesavers.WaterTube;

public class JamaiconSportsLifesaverMain {
	
	public static void main (String[] args) {
    	
    	ArrayList<Lifesaver> lifesavers= new ArrayList<Lifesaver>();
    	lifesavers.add(new ArmBands());
    	lifesavers.add(new FoamFloat());
    	lifesavers.add(new LifesaverCandy());
    	lifesavers.add(new LifeVest());
    	lifesavers.add(new SwimBelt());
    	lifesavers.add(new SwimRing());
    	lifesavers.add(new SwimSeat());
    	lifesavers.add(new WaterTube());
    	
    	for(Lifesaver lifesaver: lifesavers)
    	{
    		System.out.println(lifesaver.getType());
    		System.out.println(lifesaver.getDeflateBehavior().deflate());
    		System.out.println(lifesaver.getDeflateBehavior().inflate());
    		System.out.println(lifesaver.getFlotationBehavior().float_());
    		
    		System.out.println();
    	}
    }
}
