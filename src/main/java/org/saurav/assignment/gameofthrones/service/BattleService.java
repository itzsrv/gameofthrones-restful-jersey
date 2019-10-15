package org.saurav.assignment.gameofthrones.service;

import java.util.ArrayList;
import java.util.List;

import org.saurav.assignment.gameofthrones.model.Battle;
import org.saurav.assignment.gameofthrones.model.Places;

public class BattleService {
	
	public ArrayList<Battle> getBattles(){
		DAO dao = new DAO();
		return dao.getBattle();
	}
	
	public Battle getBattle(int battle_number){
		DAO dao = new DAO();
		return dao.getBattle(battle_number);
	}

	public List<Places> getBattleList() {
		DAO dao = new DAO();
		
		return dao.getPlacesList();
	}

	public int getBattleCount() {
		DAO dao = new DAO();
		return dao.getBattleCount();
	}
	
}
