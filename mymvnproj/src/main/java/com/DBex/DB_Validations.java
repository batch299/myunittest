package com.DBex;

public class DB_Validations extends DB_setup
{
	 DB_info di;
	 public DB_Validations(DB_info di)
	 {
	 	this.di=di;
	 }
	  public boolean get_titles_pubid(String pubid) throws Exception
	  {
		  initialize();
		  
		  boolean found=di.find_pubid_titles(pubid);
		  if(found==true)
		  {
		   rs=st.executeQuery("select title,type,price from titles where pub_id="+pubid);
		   while(rs.next())
		      System.out.println(rs.getString(1)+"   "+rs.getString(2)+"   "+rs.getInt(3));		
		   return true;
		   }
		  else
		  {
			  System.out.println("No record with the given pub id not found in Titles");
			  return false;
			  
		  }
	  }    
}
