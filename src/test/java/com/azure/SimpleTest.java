package com.azure;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class SimpleTest {

	String test = "MavenTest";
	@Test
	public void methodTest() {
		assertTrue(test.equalsIgnoreCase("MavenTest"));
	}
}
