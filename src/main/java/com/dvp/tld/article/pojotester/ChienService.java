package com.dvp.tld.article.pojotester;

import com.dvp.tld.article.pojotester.domaine.Chien;

public class ChienService {

	public int calculerIMC(final Chien chien) {
		return (int) (chien.getPoids() / Math.pow(chien.getTaille(), 2));
	}

}
