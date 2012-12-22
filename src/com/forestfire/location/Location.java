package com.forestfire.location;

/**
 * @author Ollie
 *
 */
public class Location {
	
	int x;
	int y;

	/**
	 * @param xloc
	 * @param yloc
	 */
	public Location(int xloc,int yloc) {
		
		x = xloc;
		y = yloc;
		
	}
	
	/**
	 * @return
	 */
	public int getX() {
		
		return this.x;
		
	}
	
	/**
	 * @return
	 */
	public int getY() {
		
		return this.y;
		
	}
	
	/**
	 * @param xloc
	 * @param yloc
	 */
	public void setLocation(int xloc, int yloc) {
		
		this.x = xloc;
		this.y = yloc;
		
	}
	
}
