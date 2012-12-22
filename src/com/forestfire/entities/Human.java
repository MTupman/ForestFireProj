package com.forestfire.entities;

/**
 * @author Ollie
 *
 */
public abstract class Human extends Entity {

	private enum AnimationState {
		WALKING, RUNNING, RELOADING, TAKING_DAMAGE, SHOOTING, DYING
	}
	
	private int hp;
	private int lv;
	private int ccs;
	private int rcs;
	private int str;
	private int agi;
	private int res;
	private int av;
	private AnimationState state;
	
	/**
	 * @param hpaug
	 */
	protected void updateHP(int hpaug) {
		
		this.hp = this.hp + hpaug;
		
	}
	
	/**
	 * @param lvaug
	 */
	protected void updateLV(int lvaug) {
		
		this.lv = this.lv + lvaug;
		
	}
	
	/**
	 * @param ccsaug
	 */
	protected void updateCCS(int ccsaug) {
		
		this.ccs = this.ccs + ccsaug;
		
	}
	
	/**
	 * @param rcsaug
	 */
	protected void updateRCS(int rcsaug) {
		
		this.rcs = this.rcs + rcsaug;
		
	}
	
	/**
	 * @param straug
	 */
	protected void updateSTR(int straug) {
		
		this.str = this.str + straug;
		
	}
	
	/**
	 * @param agiaug
	 */
	protected void updateAGI(int agiaug) {
		
		this.agi = this.agi + agiaug;
				
	}
	
	/**
	 * @param resaug
	 */
	protected void updateRES(int resaug) {
		
		this.res = this.res + resaug;
		
	}
	
	/**
	 * @param avaug
	 */
	protected void updateAV(int avaug) {
		
		this.av = this.av + avaug;
		
	}
	
	/**
	 * @param xloc
	 * @param yloc
	 */
	public Human(int xloc, int yloc) {
		
		super(xloc, yloc);
		
	}
	
}
