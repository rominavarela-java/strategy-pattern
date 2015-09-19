package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;

public abstract class Ball {

    private BounceBehavior bounceBehavior;
    private DeflateBehavior deflateBehavior;
    private String type;

    public Ball() {
    }

    public String roll() {
        return this.getType() + " is rolling!";
    }
    
    //getters and setters    
    public BounceBehavior getBounceBehavior(){
    	return this.bounceBehavior;
    }
    
    public void setBounceBehavior(BounceBehavior b){
    	this.bounceBehavior= b;
    }
    
    public DeflateBehavior getDeflateBehavior(){
    	return this.deflateBehavior;
    }
    
    public void setDeflateBehavior(DeflateBehavior d){
    	this.deflateBehavior= d;
    }
    
    public String getType(){
    	return this.type;
    }
    
    public void setType(String t){
    	this.type= t;
    }

}
