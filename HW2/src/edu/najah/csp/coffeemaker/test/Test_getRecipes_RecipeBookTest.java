package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;
/*
 * TestScenarioID: TS13
*/
public class Test_getRecipes_RecipeBookTest {
	/*
	 * TestScenarioID: TC1
	*/
	@Test
	public void testGetRecipes() {
		RecipeBook objRecipeBook1 = new RecipeBook();
		Recipe objRecipe1 = new Recipe();
		objRecipeBook1.addRecipe(objRecipe1);
		
		RecipeBook objRecipeBook2 = new RecipeBook();
		Recipe objRecipe2 = new Recipe();
		objRecipeBook2.addRecipe(objRecipe2);
		
		assertArrayEquals(objRecipeBook1.getRecipes(),objRecipeBook2.getRecipes());
		
	}

}
