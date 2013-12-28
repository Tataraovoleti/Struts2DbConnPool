/**
 * Copyright @ 2013 Fazal Code
 * All Rights Reserved to Fazal Code
 */
package com.java.struts.fazalcode.dbconn;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @author Tatarao voleti
 * @date   Dec 8, 2013
 */
public class DbConn {
	
	public static ComboPooledDataSource cd;
	static int count=0;
	
	static{
		   cd=new ComboPooledDataSource();
		   System.out.println("-----Connection setting count--- "+(++count));
	     try {
		  cd.setDriverClass("org.gjt.mm.mysql.Driver");
		  cd.setJdbcUrl("jdbc:mysql://localhost:3306/rao");
		  cd.setUser("root");
		  cd.setPassword("root");
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
	}
	static int c=0;
	public static Connection getConnection() throws SQLException{
		
				System.out.println("-----getConnection called count--- "+(++c));
		return cd.getConnection();
	}
}
