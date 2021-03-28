package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;
/*
 * TestScenarioID: TS7
*/
public class Test_GET_SET_amtCoffeeRecipeTest {
	/*
	 * TestScenarioID: TC1
	*/
	@Test
	public void testGetAmtCoffee() {
		int expected = 0;
		int actual = 0;
		Recipe objRecipe = new Recipe();
		actual = objRecipe.getAmtCoffee();
		assertTrue(expected == actual);
	}
	/*
	 * TestScenarioID: TC2
	*/
	@Test
	public void testSetAmtCoffeePositive() throws NumberFormatException, RecipeException {
		int expected = 3;
		int actual = 0;
		String to_be_added= "3";
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(to_be_added);
		actual = objRecipe.getAmtCoffee();
		assertTrue(expected==actual);
	}
	/*
	 * TestScenarioID: TC3
	*/
	@Test (expected = RecipeException.class)
	public void testSetAmtCoffeeNegative() throws NumberFormatException, RecipeException {
		int expected = -5;
		int actual = 0;
		String to_be_added= "-5";
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(to_be_added);
		actual = objRecipe.getAmtCoffee();
		assertTrue(expected==actual);
	}
	/*
	 * TestScenarioID: TC4
	*/
	@Test
	public void testSetAmtCoffeeZero() throws NumberFormatException, RecipeException {
		int expected = 0;
		int actual = 0;
		String to_be_added= "0";
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(to_be_added);
		actual = objRecipe.getAmtCoffee();
		assertTrue(expected==actual);
	}
	/*
	 * TestScenarioID: TC5
	*/
	@Test (expected = NumberFormatException.class)
	public void testSetAmtCoffeeString() throws NumberFormatException, RecipeException {
		int expected = 0;
		int actual = 0;
		String to_be_added= "I don't like coffe";
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(to_be_added);
		actual = objRecipe.getAmtCoffee();
		assertTrue(expected==actual);
	}
	/*
	 * TestScenarioID: TC6
	*/
	@Test ( expected = NumberFormatException.class)
	public void testSetAmtCoffeeFloat() throws NumberFormatException, RecipeException {
		int expected = 0;
		int actual = 0;
		String to_be_added= "3.3";
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(to_be_added);
		actual = objRecipe.getAmtCoffee();
		assertTrue(expected==actual);
	}


}
