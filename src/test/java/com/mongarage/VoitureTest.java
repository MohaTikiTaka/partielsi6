package com.mongarage;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class VoitureTest {

	@Test
	public void test() {
		Voiture v1 = new Voiture(1000);
		Assert.assertEquals(false, v1.tatouageVitre);
		v1.tatouerVitre();
		Assert.assertEquals(true, v1.tatouageVitre);
		v1.detatouerVitre();
		Assert.assertEquals(false, v1.tatouageVitre);
		Assert.assertEquals(1000, v1.prix);
	}

}
