package com.basics;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Basic_ex 
{
 @BeforeClass
 public static void Beforeclass()
 {
	 System.out.println("Method before class");
 }
 @Before
 public void BeforeMethod()
 {
	 System.out.println("code before each method");
 }
 @Test
 public void f1()
 {
	 System.out.println("this is method 1");
 }
 @Test
 public void f2()
 {
	 System.out.println("this is method 2");
 }
 @After
 public void AfterMethod()
 {
	 System.out.println("code after each method");
 }
 @AfterClass
 public static void AfterClass()
 {
	 System.out.println("method After the class");
 }
 
}
