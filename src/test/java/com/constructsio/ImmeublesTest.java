package com.constructsio;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class ImmeublesTest {

	@Test
	public void test() {
		Immeubles i = new Immeubles(1000000);
		i.option.prix = 4000000;
		Assert.assertEquals(1000000, i.prix);
		Assert.assertEquals(1000000, i.calculPrix());
	}

}
