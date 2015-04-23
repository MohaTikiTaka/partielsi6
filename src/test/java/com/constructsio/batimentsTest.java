package com.constructsio;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class batimentsTest {

	@Test
	public void test() {
		batiments b = new batiments(0);
		b.option.prix = 10000;
		Assert.assertEquals(0, b.prix);
		Assert.assertEquals(10000, b.calculerPrix());
				
	}

}
