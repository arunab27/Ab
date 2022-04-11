package org.junit;

public class Junit {
	@BeforeClass
	public static void fcf() {
		System.out.println("enter the  before class");
		}
	@AfterClass
	public static void tcf() {
		System.out.println("enter the after first class");
	}
    @Test
    public void gdc() {
System.out.println("test");
	}
	
}
