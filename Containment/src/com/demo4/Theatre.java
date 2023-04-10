package com.demo4;

public class Theatre {
	
	private int theatreId;
	private String theatreName;
	private String location;
	private Movie movie;
	
	public Theatre()
	{
		
	}
	
	public Theatre(int theatreId, String theatreName, String location)
	{
		this.theatreId=theatreId;
		this.theatreName=theatreName;
		this.location=location;
		
	}
	
	public Theatre(int theatreId, String theatreName, String location,Movie movie)
	{
		this(theatreId,theatreName,location);
		this.movie=movie;
		
	}

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setMovie(Movie movie)
	{
		this.movie=movie;
	}
	
	public Movie getMovie()
	{
		return movie;
	}
	
	public String toString()
	{
		return "Theatre:"+theatreId+"  "+theatreName+" "+location+"  "+movie;
	}
	

}

