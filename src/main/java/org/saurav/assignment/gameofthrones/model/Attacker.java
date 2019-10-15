package org.saurav.assignment.gameofthrones.model;

public class Attacker {
	
	private String king;
	private String attacker1;
	private String attacker2;
	private String attacker3;
	private String attacker4;
	private String outcome;
	private String commander;
	private int size;
	
	public Attacker() {
		super();
	}

	public Attacker(String king, String attacker1, String attacker2, String attacker3, String attacker4, String outcome,
			String commander, int size) {
		super();
		this.king = king;
		this.attacker1 = attacker1;
		this.attacker2 = attacker2;
		this.attacker3 = attacker3;
		this.attacker4 = attacker4;
		this.outcome = outcome;
		this.commander = commander;
		this.size = size;
	}

	public String getKing() {
		return king;
	}

	public void setKing(String king) {
		this.king = king;
	}

	public String getAttacker1() {
		return attacker1;
	}

	public void setAttacker1(String attacker1) {
		this.attacker1 = attacker1;
	}

	public String getAttacker2() {
		return attacker2;
	}

	public void setAttacker2(String attacker2) {
		this.attacker2 = attacker2;
	}

	public String getAttacker3() {
		return attacker3;
	}

	public void setAttacker3(String attacker3) {
		this.attacker3 = attacker3;
	}

	public String getAttacker4() {
		return attacker4;
	}

	public void setAttacker4(String attacker4) {
		this.attacker4 = attacker4;
	}

	public String getOutcome() {
		return outcome;
	}

	public void setOutcome(String outcome) {
		this.outcome = outcome;
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
