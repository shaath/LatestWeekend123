package day5;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotations 
{
	@Test(priority=0)
	public void function1()
	{
		System.out.println("This is Test1");
	}
	@Test(priority=1)
	public void function2()
	{
		System.out.println("This is Test2");
	}
	
	@Test(priority=2)
	public void a()
	{
		System.out.println("This is Test3");
	}

	@BeforeMethod
	public void bm()
	{
		System.out.println("This is Before Method");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("This is After Method");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("This is Before Class");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("This is After class");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("This is before Test");
	}
	@AfterTest
	public void at()
	{
		System.out.println("This is After Test");
	}
}
