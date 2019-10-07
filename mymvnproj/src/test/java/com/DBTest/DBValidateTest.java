package com.DBTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.DBex.DB_Validations;
import com.DBex.DB_info;
import com.DBex.DB_setup;

public class DBValidateTest
{
	 DB_Validations d1 = null;
	 DB_info di=Mockito.mock(DB_info.class);
		
	 @Before
	  public void setUp() throws Exception
	  {   
		 d1=new DB_Validations(di);
	  }
	  @Test
	  public void getrecordsTest() throws Exception
	  {
		  
		Mockito.when(di.find_pubid_titles("0736")).thenReturn(false);
		assertEquals(true,d1.get_titles_pubid("0736"));	 
	    Mockito.verify(di).find_pubid_titles("0736");
	  }
}
