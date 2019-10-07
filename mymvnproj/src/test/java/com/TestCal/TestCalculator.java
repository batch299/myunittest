package com.TestCal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.m1.Calculator;
import com.m1.CalculatorService;


public class TestCalculator 
{

  Calculator c1 = null;
  //CalculatorService service =Mockito.mock(CalculatorService.class);
  @Mock
  CalculatorService service;
  
  @Rule public MockitoRule rule = MockitoJUnit.rule();
  
  @Before
  public void setUp()
  {
	  c1=new Calculator(service);
  }
  @Test
  public void addTest()
  {
	 
	  Mockito.when(service.add(2,3)).thenReturn(5);
     assertEquals(10,c1.perform(2, 3));	 
     Mockito.verify(service).add(2, 3);
  }
}
