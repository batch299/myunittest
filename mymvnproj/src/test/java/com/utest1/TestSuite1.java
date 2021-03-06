package com.utest1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.utest.Test1;

public class TestSuite1 
{
	public static void main(String[] args) 
	{
		Result result = JUnitCore.runClasses(Test1.class);
		for (Failure failure : result.getFailures()) 
	    {
	       System.out.println(failure.toString());
	    }		
	    System.out.println(result.wasSuccessful());
	    
	    result = JUnitCore.runClasses(Test2.class);
		for (Failure failure : result.getFailures()) 
	    {
	       System.out.println(failure.toString());
	    }		
	    System.out.println(result.wasSuccessful());
	}
	
	
}
