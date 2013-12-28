/**
 * Copyright @ 2013 Fazal Code
 * All Rights Reserved to Fazal Code
 */
package com.java.struts.fazalcode;

import com.java.struts.fazalcode.dao.LanguageSearchDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Tatarao voleti
 * @date   Dec 8, 2013
 */
public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = -4009189608883433657L;
	
	private String username;
	private String password;
	
	public String execute(){
		/*if(username.equalsIgnoreCase("sanjay") && password.equalsIgnoreCase("sanjay")){
			return SUCCESS;	
		}
		else
			return ERROR;*/
		LanguageSearchDaoImpl lsd=new LanguageSearchDaoImpl();
		String val=lsd.isUserExist(username,password);
		return val;		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginAction [username=" + username + ", password=" + password
				+ "]";
	}
	
	
}
