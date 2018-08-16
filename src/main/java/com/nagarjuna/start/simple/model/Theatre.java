/**
 * 
 */
package com.nagarjuna.start.simple.model;

import java.util.List;

/**
 * @author nagarjun1
 *
 */
public class Theatre {

	private Integer theatreId;
	private String theatreName;
	private List<Integer> seatNumber;
	
	public Integer getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	
	public List<Integer> getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(List<Integer> seatNumber) {
		this.seatNumber = seatNumber;
	}
	public Theatre() {}
	 
	public Theatre(Integer theatreId, String theatreName, List<Integer> seatNumber) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.seatNumber = seatNumber;
	}
	public String toString() {
		return "theatreId:"+ this.theatreId + "theatreName:"+this.theatreName;
	}
}
