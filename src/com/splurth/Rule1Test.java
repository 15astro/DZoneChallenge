package com.splurth;

import static org.junit.Assert.*;

import org.junit.Test;

public class Rule1Test {

	@Test
	public void test() {
		PeriodicTable pt=new PeriodicTable();
		boolean passedRule1= pt.checkRule1("Venkmine", "Kn");
		assertEquals(true, passedRule1);
	}

}
