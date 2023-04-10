package com.demo4;

public class Movie {
	
	private int movieiId;
	private String movieName;
	private String movieDate;
	
	public Movie()
	{
		System.out.println("Inside Movie default constructor");
	}
	public Movie(int movieId, String movieName, String movieDate)
	{
		System.out.println("Inside Movie paramertirzed Construcor");
		this.movieiId = movieId;
		this.movieName = movieName;
		this.movieDate = movieDate;
	}
	public int getMovieiId() {
		return movieiId;
	}
	public void setMovieiId(int movieiId) {
		this.movieiId = movieiId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDate() {
		return movieDate;
	}
	public void setMovieDate(String movieDate) {
		this.movieDate = movieDate;
	}

	public String toString() {
		return "Movie [movieiId=" + movieiId + ", movieName=" + movieName + ", movieDate=" + movieDate + "]";
	}
	
}
