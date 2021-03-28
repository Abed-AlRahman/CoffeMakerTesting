package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;
/*
 * TestScenarioID: TS9
*/
public class Test_GET_SET_amtSugarRecipeTest {
	/*
	 * TestScenarioID: TC1
	*/
	@Test
	public void testGetAmtSugar() {
		int expected = 0;
		int actual = 0;
		Recipe objRecipe = new Recipe();
		actual = objRecipe.getAmtSugar();
		assertTrue(expected == actual);
	}
	/*
	 * TestScenarioID: TC1
	*/
	@Test
	public void testSetAmtMilkPositive() throws NumberFormatException, RecipeException {
		int expected = 3;
		int actual = 0;
		String to_be_added= "3";
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtSugar(to_be_added);
		actual = objRecipe.getAmtSugar();
		assertTrue(expected==actual);
	}
	/*
	 * TestScenarioID: TC1
	*/
	@Test (expected = RecipeException.class)
	public void testSetAmtMilkNegative() throws NumberFormatException, RecipeException {
		int expected = -5;
		int actual = 0;
		String to_be_added= "-5";
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtSugar(to_be_added);
		actual = objRecipe.getAmtSugar();
		assertTrue(expected==actual);
	}
	/*
	 * TestScenarioID: TC1
	*/
	@Test
	public void testSetAmtMilkZero() throws NumberFormatException, RecipeException {
		int expected = 0;
		int actual = 0;
		String to_be_added= "0";
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtSugar(to_be_added);
		actual = objRecipe.getAmtSugar();
		assertTrue(expected==actual);
	}
	/*
	 * TestScenarioID: TC1
	*/
	@Test (expected = NumberFormatException.class)
	public void testSetAmtMilkString() throws NumberFormatException, RecipeException {
		int expected = 0;
		int actual = 0;
		String to_be_added= "I don't like coffe";
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtSugar(to_be_added);
		actual = objRecipe.getAmtSugar();
		assertTrue(expected==actual);
	}
	/*
	 * TestScenarioID: TC1
	*/
	@Test ( expected = NumberFormatException.class)
	public void testSetAmtMilkFloat() throws NumberFormatException, RecipeException {
		int expected = 0;
		int actual = 0;
		String to_be_added= "3.3";
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtSugar(to_be_added);
		actual = objRecipe.getAmtSugar();
		assertTrue(expected==actual);
	}
	
}
