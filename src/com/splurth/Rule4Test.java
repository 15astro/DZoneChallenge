package com.splurth;

import static org.junit.Assert.*;

import org.junit.Test;

public class Rule4Test {

	@Test
	public void test() {
		PeriodicTable pt=new PeriodicTable();
		boolean passedRule1= pt.checkRule4("Venkmine", "Kn");
		assertEquals(true, passedRule1);
	}

}
