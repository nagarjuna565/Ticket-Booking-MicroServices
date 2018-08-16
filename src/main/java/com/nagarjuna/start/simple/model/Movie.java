/**
 * 
 */
package com.nagarjuna.start.simple.model;

/**
 * @author nagarjun1
 *
 */
public class Movie {
	
	private Integer id;
	private String movieName;
	private String director;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
   public String toString() {
	   return "id:" +this.id + "name:" +this.movieName + "Director:" +this.director;
   }
   public Movie() {
	   
   }
   
public Movie(Integer id, String movieName, String director) {
	super();
	this.id = id;
	this.movieName = movieName;
	this.director = director;
}
}
