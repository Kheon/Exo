package fr.feo.mowitnow;

import junit.framework.Assert;

import org.junit.Test;

public class MowerTest {

	@Test
	public void testMowerShowInitialPosition() {
		// Given
		Mower m = new Mower(0, 0, "N");

		// Then
		Assert.assertEquals("0 0 N", m.showPosition());
	}

	@Test
	public void testMowerTurnLeft() {
		// Given
		Mower m = new Mower(0, 0, "N");

		// When
		m.turnLeft();
		
		// Then
		Assert.assertEquals("0 0 W", m.showPosition());
	}
}
