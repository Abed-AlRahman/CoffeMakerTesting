package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;
/*
 * TestScenarioID: TS11
*/
public class Test_GET_SET_Price_RecipeTest {
	/*
	 * TestScenarioID: TC1
	*/
	@Test
	public void testGetPrice() {
		int expected = 0;
		int actual = 0;
		Recipe objRecipe = new Recipe();
		actual = objRecipe.getPrice();
		assertTrue(expected == actual);
	}
	/*
	 * TestScenarioID: TC2
	*/
	@Test
	public void testSetAmtMilkPositive() throws NumberFormatException, RecipeException {
		int expected = 3;
		int actual = 0;
		String to_be_added= "3";
		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(to_be_added);
		actual = objRecipe.getPrice();
		assertTrue(expected==actual);
	}
	/*
	 * TestScenarioID: TC3
	*/
	@Test (expected = RecipeException.class)
	public void testSetAmtMilkNegative() throws NumberFormatException, RecipeException {
		int expected = -5;
		int actual = 0;
		String to_be_added= "-5";
		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(to_be_added);
		actual = objRecipe.getPrice();
		assertTrue(expected==actual);
	}
	/*
	 * TestScenarioID: TC4
	*/
	@Test
	public void testSetAmtMilkZero() throws NumberFormatException, RecipeException {
		int expected = 0;
		int actual = 0;
		String to_be_added= "0";
		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(to_be_added);
		actual = objRecipe.getPrice();
		assertTrue(expected==actual);
	}
	/*
	 * TestScenarioID: TC5
	*/
	@Test (expected = NumberFormatException.class)
	public void testSetAmtMilkString() throws NumberFormatException, RecipeException {
		int expected = 0;
		int actual = 0;
		String to_be_added= "I don't like coffe";
		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(to_be_added);
		actual = objRecipe.getPrice();
		assertTrue(expected==actual);
	}
	/*
	 * TestScenarioID: TC6
	*/
	@Test ( expected = NumberFormatException.class)
	public void testSetAmtMilkFloat() throws NumberFormatException, RecipeException {
		int expected = 0;
		int actual = 0;
		String to_be_added= "3.3";
		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(to_be_added);
		actual = objRecipe.getPrice();
		assertTrue(expected==actual);
	}
	
}
