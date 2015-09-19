package mx.iteso.strategy;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class BallTest {
	
	private Ball ball;
	
	@Before
	public void setup() {
		ball=  Mockito.mock(Ball.class);
		
		//real
		Mockito.when(ball.roll()).thenCallRealMethod();
		
		//simulate
		Mockito.when(ball.getType()).thenReturn("Test ball");
	}
	
	@Test
	public void roll() {
		Assert.assertEquals("Test ball is rolling!", ball.roll());
	}
}
