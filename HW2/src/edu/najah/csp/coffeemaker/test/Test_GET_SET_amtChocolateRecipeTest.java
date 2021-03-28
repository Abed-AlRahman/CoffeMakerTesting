package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;
/*
 * TestScenarioID: TS6
*/
public class Test_GET_SET_amtChocolateRecipeTest {
	/*
	 * TestScenarioID: TC1
	*/
	@Test
	public void testGetAmtChocolate() {
		int expected = 0;
		int actual = 0;
		Recipe objRecipe = new Recipe();
		actual = objRecipe.getAmtChocolate();
		assertTrue(expected == actual);
	}
	/*
	 * TestScenarioID: TC2
	*/
	@Test
	public void testSetAmtChocolatePositive() throws NumberFormatException, RecipeException {
		int expected = 3;
		int actual = 0;
		String to_be_added= "3";
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(to_be_added);
		actual = objRecipe.getAmtChocolate();
		assertTrue(expected==actual);
	}
	/*
	 * TestScenarioID: TC3
	*/
	@Test (expected = RecipeException.class)
	public void testSetAmtChocolateNegative() throws NumberFormatException, RecipeException {
		int expected = -5;
		int actual = 0;
		String to_be_added= "-5";
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(to_be_added);
		actual = objRecipe.getAmtChocolate();
		assertTrue(expected==actual);
	}
	/*
	 * TestScenarioID: TC4
	*/
	@Test
	public void testSetAmtChocolateZero() throws NumberFormatException, RecipeException {
		int expected = 0;
		int actual = 0;
		String to_be_added= "0";
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(to_be_added);
		actual = objRecipe.getAmtChocolate();
		assertTrue(expected==actual);
	}
	/*
	 * TestScenarioID: TC5
	*/
	@Test (expected = NumberFormatException.class)
	public void testSetAmtChocolateString() throws NumberFormatException, RecipeException {
		int expected = 0;
		int actual = 0;
		String to_be_added= "I don't like coffe";
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(to_be_added);
		actual = objRecipe.getAmtChocolate();
		assertTrue(expected==actual);
	}
	/*
	 * TestScenarioID: TC6
	*/
	@Test ( expected = NumberFormatException.class)
	public void testSetAmtChocolateFloat() throws NumberFormatException, RecipeException {
		int expected = 0;
		int actual = 0;
		String to_be_added= "3.3";
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(to_be_added);
		actual = objRecipe.getAmtChocolate();
		assertTrue(expected==actual);
	}


}
