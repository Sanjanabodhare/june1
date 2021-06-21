package main;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgprac {

	@BeforeClass
	public void beforetest() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method");
	}
	
	@Test(priority=3)
	public void test3(){
		System.out.println("test3");
	}
	
	@Test(priority=1)
	public void test1(){
		System.out.println("test 1");
	}
	
	@Test(priority=8,invocationCount=3,dependsOnMethods= {"test3","test1"})
	public void test2(){
		System.out.println("test2");
	}
	@Test(priority=1,timeOut=2000)
	public void test4() throws InterruptedException{
		Thread.sleep(5000);
		System.out.println("test4");
	}
	
	@AfterMethod
	public void aftermethod(){
	System.out.println("After Method");	
	}
	
	@AfterClass
	public void aftertest() {
		System.out.println("After Class");
	}
	
	
	
}
