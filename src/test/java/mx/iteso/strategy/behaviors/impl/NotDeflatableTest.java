package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.DeflateBehavior;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NotDeflatableTest {
	
	private DeflateBehavior behavior;
	
	@Before
	public void setup() {
		behavior = new NotDeflatable();
	}
	
    @Test
    public void testDeflate() {
        assertEquals("I can't deflate!",behavior.deflate());
    }

    @Test
    public void testInflate() {
        assertEquals("I can't inflate!",behavior.inflate());
    }
}
