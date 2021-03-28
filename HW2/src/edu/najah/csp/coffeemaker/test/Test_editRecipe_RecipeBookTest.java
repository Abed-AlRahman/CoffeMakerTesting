package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;
/*
 * TestScenarioID: TS4
*/
public class Test_editRecipe_RecipeBookTest {
	/*
	 * TestScenarioID: TC1
	*/
	@Test 
	public void testEditRecipeOutOfBound()  {
		RecipeBook objRecipeBook = new RecipeBook();
		
		assertTrue(objRecipeBook.editRecipe(5, new Recipe())==null);
	}
	/*
	 * TestScenarioID: TC2
	*/
	@Test 
	public void testDeleteRecipeNull()  {
		RecipeBook objRecipeBook = new RecipeBook();
		assertTrue(objRecipeBook.editRecipe(5, new Recipe())==null);
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
		
		Recipe objRecipe2 = new Recipe();
		objRecipe2.setName("cocao");

		objRecipeBook.addRecipe(objRecipe);
		
		actual = objRecipeBook.editRecipe(0, objRecipe2);
		
		assertTrue(expected.equals(actual));
	}

}
