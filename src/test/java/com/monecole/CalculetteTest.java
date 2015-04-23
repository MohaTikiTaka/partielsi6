package com.monecole;

import junit.framework.Assert;

import org.junit.Test;

public class CalculetteTest {

	Calculette calculette = new Calculette();

	@Test
	public void testAdditionDoitRenvoyerLeBonResultat() {
		int resultat = calculette.addition(2, 3);
		Assert.assertEquals("Mauvais résultat de l'addition", 5, resultat);

	}

	@Test(expected = RuntimeException.class)
	public void testAdditionNeDoitPasAccepterDeParametre1null() {
		calculette.addition(null, 3);
	}

	@Test(expected = RuntimeException.class)
	public void testAdditionNeDoitPasAccepterDeParametre2null() {
		calculette.addition(3, null);
	}

	
}
