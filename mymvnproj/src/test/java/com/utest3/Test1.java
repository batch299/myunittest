package com.utest3;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestResult;

public class Test1 extends TestCase
{
	 protected double fValue1;
	 protected double fValue2;
	   
	 @Before 
	 public void setUp() 
	 {
	     fValue1 = 2.0;
	     fValue2 = 3.0;
	 }
	 @Test
	 public void testAdd()
	 {
	      System.out.println("No of Test Case = "+ this.countTestCases());
			
	      //test getName 
	     
	      System.out.println("Test Case Name = "+ this.getName());

	      //test setName
	      this.setName("testNewAdd");
	      System.out.println("Updated Test Case Name = "+ this.getName());
	      TestResult r=this.run();
	      System.out.println(r.errorCount());
      }
	 @Test
	 public void testsub()
	 {
		 System.out.println("No of Test Case = "+ this.countTestCases());
	 }
	 
}
