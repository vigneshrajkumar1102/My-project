package org.testng;

import org.testng.annotations.Test;
// to give priority instead of @ ignore
public class Testng1 {
	@Test
	public void test1() {
		System.out.println("class1");
	}
	@Test
	public void test2() {
		System.out.println("class2");
	}
	@Test
	public void test4() {
		System.out.println("class4");
	}
	@Test
	public void test3() {
		System.out.println("class3");
	}
	@Test
	public void test5() {
		System.out.println("class5");
	}

}
