package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;

public class Lifesaver {
	private FlotationBehavior flotationBehavior;
    private DeflateBehavior deflateBehavior;
    private String type;
    
    //getters and setters    
    public FlotationBehavior getFlotationBehavior(){
    	return this.flotationBehavior;
    }
    
    public void setFlotationBehavior(FlotationBehavior f){
    	this.flotationBehavior= f;
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
