package org.saurav.assignment.gameofthrones.model;

public class Places {
	private String location;
	private String region;
	
	public Places() {
		
	}

	public Places(String location, String region) {
		super();
		this.location = location;
		this.region = region;
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
	
	
}
