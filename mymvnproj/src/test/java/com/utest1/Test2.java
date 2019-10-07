package com.utest1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test2 
{
	 String message = "Robert";	
	 MessageUtil messageUtil = new MessageUtil(message);
	 
	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "Robert";
	      assertEquals(message,messageUtil.printMessage());
	   }
}
