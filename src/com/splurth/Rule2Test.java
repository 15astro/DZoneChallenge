package com.splurth;

import static org.junit.Assert.*;

import org.junit.Test;

public class Rule2Test {

	@Test
	public void test() {
		PeriodicTable pt=new PeriodicTable();
		boolean passedRule1= pt.checkRule2("Tullium", "Ty");
		assertEquals(false, passedRule1);
	}

}
