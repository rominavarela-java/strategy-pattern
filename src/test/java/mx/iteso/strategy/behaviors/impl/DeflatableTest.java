package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.DeflateBehavior;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeflatableTest {
	
	private DeflateBehavior behavior;
	
	@Before
	public void setup() {
		behavior = new Deflatable();
	}
	
    @Test
    public void testDeflate() {
        assertEquals("I'm deflating!",behavior.deflate());
    }

    @Test
    public void testInflate() {
        assertEquals("I'm inflating!",behavior.inflate());
    }
}
