package org.sdet40.practice;

import org.testng.annotations.Test;

public class TestngPractice {

	@Test(dependsOnMethods = "step2")
	public void step1() {
		System.out.println("hi1");
	}

@Test
public void step2() {
	System.out.println("h2");
}



}

