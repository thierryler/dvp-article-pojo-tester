package com.dvp.tld.article.pojotester.domaine;

import static pl.pojo.tester.api.FieldPredicate.exclude;
import static pl.pojo.tester.api.FieldPredicate.include;
import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;
import static pl.pojo.tester.api.assertion.Method.CONSTRUCTOR;
import static pl.pojo.tester.api.assertion.Method.EQUALS;
import static pl.pojo.tester.api.assertion.Method.GETTER;
import static pl.pojo.tester.api.assertion.Method.HASH_CODE;
import static pl.pojo.tester.api.assertion.Method.SETTER;
import static pl.pojo.tester.api.assertion.Method.TO_STRING;

import org.junit.Ignore;
import org.junit.Test;

public class AnimalTest {

	@Test
	public void testPojoChien() {
		// Arrange
		final Class<?> classUnderTest = Chien.class;

		// Act

		// Assert
		assertPojoMethodsFor(classUnderTest) //
				.areWellImplemented();
	}

	@Test
	public void testPojoLapin() {
		// Arrange
		final Class<?> classUnderTest = Lapin.class;

		// Act

		// Assert
		assertPojoMethodsFor(classUnderTest) //
				.testing(GETTER) //
				.testing(TO_STRING) //
				// .testing(EQUALS) //
				// .testing(HASH_CODE) //
				.testing(EQUALS, HASH_CODE) //
				.testing(CONSTRUCTOR) //
				.areWellImplemented();
	}

	@Test
	@Ignore
	public void testPojoChatFailed() {
		// Arrange
		final Class<?> classUnderTest = Chat.class;

		// Act

		// Assert
		assertPojoMethodsFor(classUnderTest) //
				.testing(GETTER) //
				.testing(TO_STRING) //
				.testing(EQUALS, HASH_CODE) //
				.testing(CONSTRUCTOR) //
				.areWellImplemented();

	}

	@Test
	public void testPojoChatInclude() {
		// Arrange
		final Class<?> classUnderTest = Chat.class;

		// Act

		// Assert
		assertPojoMethodsFor(classUnderTest, include("name", "age")) //
				.testing(EQUALS, HASH_CODE) //
				.testing(CONSTRUCTOR) //
				.areWellImplemented();

		assertPojoMethodsFor(classUnderTest, include("poids", "moustache", "petits")) //
				.testing(SETTER) //
				.areWellImplemented();

		assertPojoMethodsFor(classUnderTest) //
				.testing(GETTER) //
				.testing(TO_STRING) //
				.areWellImplemented();
	}

	@Test
	public void testPojoChatExclude() {
		// Arrange
		final Class<?> classUnderTest = Chat.class;

		// Act

		// Assert
		assertPojoMethodsFor(classUnderTest, exclude("poids", "moustache", "petits")) //
				.testing(EQUALS, HASH_CODE) //
				.testing(CONSTRUCTOR) //
				.areWellImplemented();

		assertPojoMethodsFor(classUnderTest) //
				.testing(GETTER) //
				.areWellImplemented();
	}

	@Test
	public void testPojoDauphin() {
		// Arrange
		final Class<?> classUnderTest = Dauphin.class;

		// Act

		// Assert
		assertPojoMethodsFor(classUnderTest) //
				.areWellImplemented();
	}

}
