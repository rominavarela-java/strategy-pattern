package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.BounceBehavior;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IrregularBounceTest {
	
	private BounceBehavior behavior;
	
	@Before
	public void setup() {
		behavior = new IrregularBounce();
	}
	
    @Test
    public void testBounce() {
        assertEquals("I'm bouncing irregularly!", behavior.bounce());
    }
}
