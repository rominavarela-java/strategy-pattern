package mx.iteso.strategy.behaviors.impl;

import static org.junit.Assert.assertEquals;
import mx.iteso.strategy.behaviors.FlotationBehavior;

import org.junit.Before;
import org.junit.Test;

public class FloatableTest {
	
	private FlotationBehavior behavior;
	
	@Before
	public void setup() {
		behavior = new Floatable();
	}
	
    @Test
    public void testFloat_() {
        assertEquals("I can float :D",behavior.float_());
    }
}
