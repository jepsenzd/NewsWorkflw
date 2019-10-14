package com.NewsWorkflw.common.model;

import java.util.Date;

public class SampleContent {

	//Wouldn't we want to start putting in better names that will go with your design?
	//I saw your design document and it looked great!
	String calendar;
	String article;
	String author;
	String title;
	String url;
	String summary;
	Date createdDate;
	
	//quick examples of some i came up with
	public String getArticle() {
		return article;
	}
    public String getCalendar() {
    	return calendar;
    }
    
    
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}