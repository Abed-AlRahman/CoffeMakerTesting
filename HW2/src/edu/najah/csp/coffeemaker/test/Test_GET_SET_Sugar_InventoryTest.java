package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Inventory;
/*
 * TestScenarioID: TS12
*/
public class Test_GET_SET_Sugar_InventoryTest {
	/*
	 * TestScenarioID: TC1
	*/
	@Test
	public void testGetSugar() {
		int expected = 15;
		int actual = 0;
		
		Inventory objInventory = new Inventory();
		actual=objInventory.getSugar();
		assertTrue(expected==actual);
	}
	/*
	 * TestScenarioID: TC2
	*/
	@Test
	public void testSetSugarFive() {
		int expected = 5;
		int actual = 0;
		
		Inventory objInventory = new Inventory();
		objInventory.setSugar(expected);
		actual=objInventory.getSugar();
		assertTrue(expected==actual);
	}
	/*
	 * TestScenarioID: TC3
	*/
	@Test
	public void testSetSugarZero() {
		int expected = 0;
		int actual = 0;
		
		Inventory objInventory = new Inventory();
		objInventory.setSugar(expected);
		actual=objInventory.getSugar();
		assertTrue(expected==actual);
	}
	/*
	 * TestScenarioID: TC4
	*/
	@Test 
	public void testSetSugarMinus() {
		int expected = -1;
		int actual = 0;
		
		Inventory objInventory = new Inventory();
		objInventory.setSugar(expected);
		actual=objInventory.getSugar();
		assertFalse(expected==actual);
	}

}
