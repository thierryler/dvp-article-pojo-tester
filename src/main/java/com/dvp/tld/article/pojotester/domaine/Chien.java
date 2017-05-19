package com.dvp.tld.article.pojotester.domaine;

import java.util.Date;
import java.util.List;

public class Chien {

	private String name;
	private String race;
	private double poids; // Poids en kg
	private double taille; // Taille exprimee en metre
	private Date dateNaissance;
	private List<String> couleurs;

	public Chien() {
		// Rien
	}

	@Override
	public String toString() {
		return "Chien [name=" + name + ", race=" + race + ", poids=" + poids + ", taille=" + taille + ", dateNaissance="
				+ dateNaissance + ", couleurs=" + couleurs + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((couleurs == null) ? 0 : couleurs.hashCode());
		result = prime * result + ((dateNaissance == null) ? 0 : dateNaissance.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(poids);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((race == null) ? 0 : race.hashCode());
		temp = Double.doubleToLongBits(taille);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chien other = (Chien) obj;
		if (couleurs == null) {
			if (other.couleurs != null)
				return false;
		} else if (!couleurs.equals(other.couleurs))
			return false;
		if (dateNaissance == null) {
			if (other.dateNaissance != null)
				return false;
		} else if (!dateNaissance.equals(other.dateNaissance))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(poids) != Double.doubleToLongBits(other.poids))
			return false;
		if (race == null) {
			if (other.race != null)
				return false;
		} else if (!race.equals(other.race))
			return false;
		if (Double.doubleToLongBits(taille) != Double.doubleToLongBits(other.taille))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public List<String> getCouleurs() {
		return couleurs;
	}

	public void setCouleurs(List<String> couleurs) {
		this.couleurs = couleurs;
	}

}
