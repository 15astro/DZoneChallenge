package com.splurth;

import static org.junit.Assert.*;

import org.junit.Test;

public class validNameTest {

	@Test
	public void test() {
		
		PeriodicTable pt=new PeriodicTable();
		boolean isValid= pt.isValidSymbol("Zeddemorium", "Zr");
		assertEquals(true, isValid);
	}

}
