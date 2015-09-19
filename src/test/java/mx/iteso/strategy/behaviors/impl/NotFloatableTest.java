package mx.iteso.strategy.behaviors.impl;

import static org.junit.Assert.assertEquals;
import mx.iteso.strategy.behaviors.FlotationBehavior;

import org.junit.Before;
import org.junit.Test;

public class NotFloatableTest {
	
	private FlotationBehavior behavior;
	
	@Before
	public void setup() {
		behavior = new NotFloatable();
	}
	
    @Test
    public void testFloat_() {
        assertEquals("I can't float x.x",behavior.float_());
    }
}
