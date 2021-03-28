package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;

/*
 * TestScenarioID: TS1
*/

public class Test_addRecipe_RecipeBookTest {

	/*
	 * TestScenarioID: TC1
	*/
	@Test
	public void testAddRecipe() {
		RecipeBook objRecipeBook = new RecipeBook();
		Recipe objRecipe = new Recipe();
		
		assertTrue(objRecipeBook.addRecipe(objRecipe));
	}
	
	/*
	 * TestScenarioID: TC2
	*/
	@Test
	public void testAddRecipeExists() {
		RecipeBook objRecipeBook = new RecipeBook();
		Recipe objRecipe = new Recipe();
		objRecipeBook.addRecipe(objRecipe);
		
		assertFalse(objRecipeBook.addRecipe(objRecipe));
	}

}
