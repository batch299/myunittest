package com.DBex;

public class DB_info extends DB_setup
{
	public boolean find_pubid_titles(String pubid) 
	{
		  int rowcount=0;
		  try
		  {
		  rs=st.executeQuery("select pub_id from titles where pub_id="+pubid);
		  System.out.println(rs);
		  
		  while(rs.next())
			  rowcount++;
		  }catch(Exception e) {}
		  
		  if(rowcount>0)
			  return true;
		  else
			  return false;
	 }
}
