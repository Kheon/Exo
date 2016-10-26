package fr.feo.mowitnow;

import junit.framework.Assert;

import org.junit.Test;

public class MowItNowTest {

	@Test
	public void test() {
		MowItNow mowItNow = new MowItNow();
		mowItNow.setMapSize(5, 5);
		Mower mower1 = mowItNow.addMower(1, 2, "N");
		mowItNow.giveOrders(mower1, "GAGAGAGAA");
		Assert.assertEquals("1 3 N", mower1.showPosition());
		Mower mower2 = mowItNow.addMower(3, 3, "E");
		mowItNow.giveOrders(mower2, "AADAADADDA");
		Assert.assertEquals("5 1 E", mower2.showPosition());
	}
}
