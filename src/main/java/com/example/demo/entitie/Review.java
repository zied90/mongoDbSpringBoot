package com.example.demo.entitie;

public class Review {
	private String userName;
	private int rating;
	private boolean approuved;
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Review(String userName, int rating, boolean approuved) {
		super();
		this.userName = userName;
		this.rating = rating;
		this.approuved = approuved;
	}
	public String getUserName() {
		return userName;
	}
	public int getRating() {
		return rating;
	}
	public boolean isApprouved() {
		return approuved;
	}
	

}
