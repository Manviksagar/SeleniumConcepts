package com.sag.testng;

import org.testng.annotations.Test;

public class DependsOn_Check {
	
	@Test
	public void Testcase1() {
		System.out.println("Testcase 1 from depends on");
	}
	
	
	@Test(dependsOnMethods="Testcase1")
	public void Testcase2() {
		System.out.println("Testcase 2 from depends on");
	}
	
	

}
