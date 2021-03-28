package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;
import edu.najah.csp.coffeemaker.exceptions.RecipeBookException;
/*
 * TestScenarioID: TS3
*/
public class Test_deleteRecipe_RecipeBookTest {
	/*
	 * TestScenarioID: TC1
	*/
	@Test 
	public void testDeleteRecipeOutOfBound()  {
		RecipeBook objRecipeBook = new RecipeBook();
		assertTrue(objRecipeBook.deleteRecipe(5)==null);
	}
	/*
	 * TestScenarioID: TC2
	*/
	@Test 
	public void testDeleteRecipeNull()  {
		RecipeBook objRecipeBook = new RecipeBook();
		assertTrue(objRecipeBook.deleteRecipe(3)==null);
	}
	/*
	 * TestScenarioID: TC3
	*/
	@Test 
	public void testDeleteRecipe()  {
		String expected = "Dump coffe";
		String actual = "";
		RecipeBook objRecipeBook = new RecipeBook();
		Recipe objRecipe = new Recipe();
		objRecipeBook.addRecipe(objRecipe);
		
		actual = objRecipeBook.deleteRecipe(0);
		
		assertTrue(expected.equals(actual));
	}

}
