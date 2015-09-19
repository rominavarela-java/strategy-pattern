package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.BounceBehavior;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrashTest {
	
	private BounceBehavior behavior;
	
	@Before
	public void setup() {
		behavior = new Crash();
	}
	
    @Test
    public void testBounce() {
        assertEquals("I crashed!! I can't bounce", behavior.bounce());
    }
}
