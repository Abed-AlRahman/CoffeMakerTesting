package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
/*
 * TestScenarioID: TS14
*/
public class Test_toString_RecipeTest {
	/*
	 * TestScenarioID: TC1
	*/
	@Test
	public void testToString() {
		String expected = "Dump coffe 0 0 0 0 0";
		String actual = "";
		Recipe objRecipe = new Recipe();
		actual = objRecipe.toString();
		assertTrue(expected.equals(actual));
	}

}
