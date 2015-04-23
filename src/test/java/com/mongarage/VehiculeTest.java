package com.mongarage;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class VehiculeTest {

	@Test
	public void test() {
		Vehicule v = new Vehicule(1000);
		v.option.prix=2;
		v.option2.prix= 6;
		Assert.assertEquals(1000, v.prix);
		Assert.assertEquals(1008, v.calculerPrix());
	}

}
