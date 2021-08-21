package com.ibm.sf.observer;
/*
 * NewsChannel class overrides update() 
 * method which is invoked when state of NewsAgency changes
 */
public class NewsChannel implements Channel {
    private String news;    
 
    public String getNews() {
		return news;
	}
        
	public void setNews(String news) {
		this.news = news;
	}

	@Override
    public void update(Object news) {
        this.setNews((String) news);
    } 
}