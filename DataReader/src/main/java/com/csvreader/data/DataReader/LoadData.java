package com.csvreader.data.DataReader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoadData {
	
	static Logger log = Logger.getLogger(LoadData.class);
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/mydb";
	//  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";
	   
	   public static void main(String[] args) {
		   String log4jpath=System.getProperty("user.dir")+"\\src\\main\\java\\com\\csvreader\\data\\DataReader\\log4j.properties";
		   PropertyConfigurator.configure(log4jpath);
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      log.info("Connecting to the Database");
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);
	      System.out.println("Creating statement...");
	      String sql;
	      sql = "insert into Commdities  vales (?,?,?,?,?,?,?,?)";
	      
	      stmt = conn.prepareStatement(sql);
	     // stmt.setString(1,)
	     
	      stmt.executeUpdate(sql);

	      //STEP 5: Extract data from result set
	      
	         //Display values
	       	      

	   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      }// nothing we can do
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
}
	   }
