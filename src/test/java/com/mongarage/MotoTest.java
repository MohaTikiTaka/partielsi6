package com.mongarage;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class MotoTest {

	@Test
	public void test() {
		Garage garage = new Garage() ;
		garage.initMoto();
		Assert.assertEquals("ktm", garage.m2.marque);
		
	}

}
