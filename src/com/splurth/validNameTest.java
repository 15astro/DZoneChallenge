package com.splurth;

import static org.junit.Assert.*;

import org.junit.Test;

public class validNameTest {
	@Test
	public void test() {
		PeriodicTable pt=new PeriodicTable();
		assertEquals(true, pt.isValidSymbol("Spenglerium", "Ee"));
		assertEquals(true, pt.isValidSymbol("Zeddemorium", "Zr"));
		assertEquals(true, pt.isValidSymbol("Venkmine", "Kn"));
		assertEquals(false, pt.isValidSymbol("Stantzon", "Zt"));
		assertEquals(false, pt.isValidSymbol("Melintzum", "Nn"));
		assertEquals(false, pt.isValidSymbol("Tullium", "Ty"));
	}

}
