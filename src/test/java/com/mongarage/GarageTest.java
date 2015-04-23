package com.mongarage;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class GarageTest {

	@Test
	public void test() {
		//setup
		Garage garage = new Garage();
		//exercice
		garage.initVoiture();
		//Assert
		Assert.assertEquals("ktm", garage.m2.marque);
	}

}
