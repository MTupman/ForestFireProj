package com.forestfire.entities;

import com.forestfire.location.*;

/**
 * @author Ollie
 *
 */
public abstract class Entity {
	
	private Location location;
	private Location targetloc;
	private long entityID;

	/**
	 * @return
	 */
	protected long getID() {
		
		return this.entityID;
		
	}
	
	/**
	 * @param xloc
	 * @param yloc
	 */
	public Entity(int xloc, int yloc) {
		
		this.location = new Location(xloc, yloc);
		this.targetloc = null;
		//TODO generate unique entityID
		
	}
	
}
