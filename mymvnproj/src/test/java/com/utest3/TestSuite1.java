package com.utest3;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class TestSuite1 
{
	public static void main(String[] a)
	{
	  TestSuite suite = new TestSuite(Test1.class, Test2.class);
	  TestResult result = new TestResult();
	  suite.run(result);
	  System.out.println("Number of test cases = " + result.runCount());

	}

}
