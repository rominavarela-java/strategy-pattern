package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.FlotationBehavior;

public class NotFloatable implements FlotationBehavior{

	public String float_() {
		return "I can't float x.x";
	}

}
