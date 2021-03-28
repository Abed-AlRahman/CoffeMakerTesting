package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
/*
 * TestScenarioID: TS5
*/
public class Test_equals_RecipeTest {
	/*
	 * TestScenarioID: TC1
	*/
	@Test
	public void testEqualsObject() {
		Recipe objRecipe = new Recipe();
		
		assertTrue(objRecipe.equals(objRecipe));
	}
	/*
	 * TestScenarioID: TC2
	*/
	@Test
	public void testEqualsNull() {
		Recipe objRecipe = new Recipe();
		
		assertFalse(objRecipe.equals(null));	
	}
	/*
	 * TestScenarioID: TC3
	*/
	@Test
	public void testEqualsDifferentClass() {
		Recipe objRecipe = new Recipe();
		int dummyInt = 0;
		assertFalse(objRecipe.equals(dummyInt));	
	}
	/*
	 * TestScenarioID: TC4
	*/
	@Test
	public void testEqualsDifferentObjSameName() {
		Recipe objRecipe = new Recipe();
		Recipe objRecipe2 = new Recipe();
		assertTrue(objRecipe.equals(objRecipe2));	
	}

}
