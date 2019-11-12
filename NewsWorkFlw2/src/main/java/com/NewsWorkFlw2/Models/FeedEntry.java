package com.NewsWorkFlw2.Models;


	import java.util.Date;

	public class FeedEntry {
//over all this project looks great and it's difficult to make any edits
//something simple like changing the string names to match a newspaper like site
	    String title;
	    String link;
	    //String story/article
	    String content;
	    //String publishDate
	    Date date;

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getLink() {
	        return link;
	    }

	    public void setLink(String link) {
	        this.link = link;
	    }

	    public String getContent() {
	        return content;
	    }

	    public void setContent(String content) {
	        this.content = content;
	    }

	    public Date getDate() {
	        return date;
	    }

	    public void setDate(Date date) {
	        this.date = date;
	    }
	}

