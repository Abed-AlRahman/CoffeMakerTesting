package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
/*
 * TestScenarioID: TS10
*/
public class Test_GET_SET_Name_RecipeTest {
	/*
	 * TestScenarioID: TC1
	*/
	@Test
	public void testGetName() {
		String expected = "Dump coffe";
		String actual = "";
		Recipe objRecipe = new Recipe();
		actual = objRecipe.getName();
		assertTrue(expected.equals(actual));
	}
	/*
	 * TestScenarioID: TC2
	*/
	@Test
	public void testSetName() {
		String expected = "3la Taree2";
		String actual = "";
		Recipe objRecipe = new Recipe();
		objRecipe.setName(expected);
		actual = objRecipe.getName();
		assertTrue(expected.equals(actual));	
		}
	
}
