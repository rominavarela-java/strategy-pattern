package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.BounceBehavior;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KillerBounceTest {
	
	private BounceBehavior behavior;
	
	@Before
	public void setup() {
		behavior = new KillerBounce();
	}
	
    @Test
    public void testBounce() {
        assertEquals("Be careful with demolition!", behavior.bounce());
    }
}
