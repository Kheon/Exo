package fr.feo.mowitnow;

import junit.framework.Assert;

import org.junit.Test;

public class DirectionTest {

	@Test
	public void testDirectionTurnRightFromN() {
		// Given
		Direction dir = Direction.N;

		// When
		Direction newDir = dir.getRightDirection();

		// Then
		Assert.assertEquals(Direction.E, newDir);
	}

	@Test
	public void testDirectionTurnLeft() {
		// Given
		Direction dir = Direction.N;

		// When
		Direction newDir = dir.getLeftDirection();

		// Then
		Assert.assertEquals(Direction.W, newDir);
	}
	
	@Test
	public void testDirectionTurnRightFromW() {
		// Given
		Direction dir = Direction.W;

		// When
		Direction newDir = dir.getRightDirection();

		// Then
		Assert.assertEquals(Direction.N, newDir);
	}
}
