package org.saurav.assignment.gameofthrones.model;



public class Battle {
	private String name;
	private int year;
	private int battle_number;
	private String battle_type;
	private int major_death;
	private int major_capture;
	private int summer;
	private String location;
	private String region;
	private String note;
	
	public Battle() {
		
	}

	public Battle(String name, int year, int battle_number, String battle_type, int major_death, int major_capture,
			int summer, String location, String region, String note) {
		super();
		this.name = name;
		this.year = year;
		this.battle_number = battle_number;
		this.battle_type = battle_type;
		this.major_death = major_death;
		this.major_capture = major_capture;
		this.summer = summer;
		this.location = location;
		this.region = region;
		this.note = note;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getBattle_number() {
		return battle_number;
	}

	public void setBattle_number(int battle_number) {
		this.battle_number = battle_number;
	}

	public String getBattle_type() {
		return battle_type;
	}

	public void setBattle_type(String battle_type) {
		this.battle_type = battle_type;
	}

	public int getMajor_death() {
		return major_death;
	}

	public void setMajor_death(int major_death) {
		this.major_death = major_death;
	}

	public int getMajor_capture() {
		return major_capture;
	}

	public void setMajor_capture(int major_capture) {
		this.major_capture = major_capture;
	}

	public int getSummer() {
		return summer;
	}

	public void setSummer(int summer) {
		this.summer = summer;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	

}
