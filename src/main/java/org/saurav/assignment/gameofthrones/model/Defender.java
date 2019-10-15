package org.saurav.assignment.gameofthrones.model;

public class Defender {
	
	private String king;
	private String defender;
	private String defender2;
	private String defender3;
	private String defender4;
	private String commander;
	private int size;
	
	public Defender() {
		super();
	}

	public Defender(String king, String defender, String defender2, String defender3, String defender4,
			String commander, int size) {
		super();
		this.king = king;
		this.defender = defender;
		this.defender2 = defender2;
		this.defender3 = defender3;
		this.defender4 = defender4;
		this.commander = commander;
		this.size = size;
	}

	public String getKing() {
		return king;
	}

	public void setKing(String king) {
		this.king = king;
	}

	public String getDefender() {
		return defender;
	}

	public void setDefender(String defender) {
		this.defender = defender;
	}

	public String getDefender2() {
		return defender2;
	}

	public void setDefender2(String defender2) {
		this.defender2 = defender2;
	}

	public String getDefender3() {
		return defender3;
	}

	public void setDefender3(String defender3) {
		this.defender3 = defender3;
	}

	public String getDefender4() {
		return defender4;
	}

	public void setDefender4(String defender4) {
		this.defender4 = defender4;
	}

	public String getCommander() {
		return commander;
	}

	public void setCommander(String commander) {
		this.commander = commander;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
