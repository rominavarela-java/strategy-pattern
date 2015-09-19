package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.BounceBehavior;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NormalBounceTest {
	
	private BounceBehavior behavior;
	
	@Before
	public void setup() {
		behavior = new NormalBounce();
	}
	
    @Test
    public void testBounce() {
        assertEquals("I'm bouncing normally!", behavior.bounce());
    }
}
