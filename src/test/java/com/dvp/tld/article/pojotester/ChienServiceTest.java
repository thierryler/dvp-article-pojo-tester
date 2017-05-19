package com.dvp.tld.article.pojotester;

import org.junit.Assert;
import org.junit.Test;

import com.dvp.tld.article.pojotester.domaine.Chien;

public class ChienServiceTest {

	private ChienService chienService = new ChienService();

	@Test
	public void testCalculerIMCMilou() {
		// Arrange
		final double taille = 0.39;
		final double poids = 9;
		final int expectedIMC = 59;

		// Arrange obj
		final Chien milou = new Chien();
		milou.setTaille(taille);
		milou.setPoids(poids);

		// Act
		final int imc = chienService.calculerIMC(milou);

		// Assert
		Assert.assertEquals(expectedIMC, imc);
	}
}
