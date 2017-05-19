package com.dvp.tld.article.pojotester.domaine;

import java.util.Arrays;

public class Chat {

	// Attributs principaux (dans cons, hashcode et equals)
	private final String name;
	private final int age;

	// Attributs en plus
	private double poids;
	private String moustache;
	private String[] petits;

	public Chat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Chat [name=" + name + ", age=" + age + ", poids=" + poids + ", moustache=" + moustache + ", petits="
				+ Arrays.toString(petits) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Chat other = (Chat) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public String getMoustache() {
		return moustache;
	}

	public void setMoustache(String moustache) {
		this.moustache = moustache;
	}

	public String[] getPetits() {
		return petits;
	}

	public void setPetits(String[] petits) {
		this.petits = petits;
	}

}
