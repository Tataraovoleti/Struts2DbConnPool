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
public class SearchAction extends ActionSupport {

	private static final long serialVersionUID = 3650552154891676255L;
	
	private String language;
	private String tutorial;
	
	public String execute(){
		String tut="";
		LanguageSearchDaoImpl lsd=new LanguageSearchDaoImpl();
		tut=lsd.searchTutorial(language);
		if(tut!=null && tut!=""){
			setTutorial(tut);
			return SUCCESS;
		}
		else
			return ERROR;
	}
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getTutorial() {
		return tutorial;
	}
	public void setTutorial(String tutorial) {
		this.tutorial = tutorial;
	}
	
	

}
