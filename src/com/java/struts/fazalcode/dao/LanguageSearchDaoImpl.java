/**
 * Copyright @ 2013 Fazal Code
 * All Rights Reserved to Fazal Code
 */
package com.java.struts.fazalcode.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.java.struts.fazalcode.dbconn.DbConn;
/**
 * @author Tatarao voleti
 * @date   Dec 8, 2013
 */
public class LanguageSearchDaoImpl {
	
	Connection con=null;
	
	public LanguageSearchDaoImpl(){
		try {
			con=DbConn.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public String isUserExist(String user,String password){
	
		String val="";
		try {
		//	Connection con=DbConn.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from user where user=? and password=?");
			ps.setString(1,user);
			ps.setString(2,password);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				val="success";
			}
			else
				val= "error";		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return val;
	}
	
	public String searchTutorial(String language){
		String tut="";
		try {
		//	Connection con=DbConn.getConnection();
			String str="select bookname from select_books where category=?";
			PreparedStatement ps=con.prepareStatement(str);
			ps.setString(1,language);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				tut=rs.getString(1);
			}
		} catch (Exception e) {
		}
		
		return tut;
	}
}
