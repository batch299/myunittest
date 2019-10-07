package com.utest3;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner1 
{
	 public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(Test1.class);
			
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }		
	      System.out.println(result.wasSuccessful());
	    
	      System.out.println("==================");
	      result = JUnitCore.runClasses(Test2.class);
		  for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	   }
}
