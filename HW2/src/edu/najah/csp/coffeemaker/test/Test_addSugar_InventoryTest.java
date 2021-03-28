package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Inventory;
import edu.najah.csp.coffeemaker.exceptions.InventoryException;

public class Test_addSugar_InventoryTest {

	@Test (expected = NumberFormatException.class)
	public void testAddSugarString() throws NumberFormatException, InventoryException {
		int expected = 15;
		int actual = 0;
		String toBeAdded = "x";
		
		Inventory objInventory = new Inventory();
		
		objInventory.addSugar(toBeAdded);
		actual = objInventory.getSugar();
		assertTrue(expected==actual);
	}

	@Test
	public void testAddSugarZero() throws NumberFormatException, InventoryException {
		int expected = 15;
		int actual = 0;
		String toBeAdded = "0";
		
		Inventory objInventory = new Inventory();
		
		objInventory.addSugar(toBeAdded);
		actual = objInventory.getSugar();
		assertTrue(expected==actual);
	}


	@Test
	public void testAddSugarPositive() throws NumberFormatException, InventoryException{
		int expected = 20;
		int actual = 0;
		String toBeAdded = "5";
		
		Inventory objInventory = new Inventory();
		
		objInventory.addSugar(toBeAdded);
		actual = objInventory.getSugar();
		assertTrue(expected==actual);	
	}

	@Test (expected = InventoryException.class)
	public void testAddSugarMinus() throws NumberFormatException, InventoryException{
		int expected = 14;
		int actual = 0;
		String toBeAdded = "-1";
		
		Inventory objInventory = new Inventory();
		
		objInventory.addSugar(toBeAdded);
		actual = objInventory.getSugar();
		assertTrue(expected==actual);	
	}

	@Test (expected = NumberFormatException.class)
	public void testAddSugarFloat() throws NumberFormatException, InventoryException{
		int expected = 15;
		int actual = 0;
		String toBeAdded = "0.3";
		
		Inventory objInventory = new Inventory();
		
		objInventory.addSugar(toBeAdded);
		actual = objInventory.getSugar();
		assertTrue(expected==actual);
	}

}
