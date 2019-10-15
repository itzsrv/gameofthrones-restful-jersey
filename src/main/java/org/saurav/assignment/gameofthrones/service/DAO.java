package org.saurav.assignment.gameofthrones.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.saurav.assignment.gameofthrones.model.Battle;
import org.saurav.assignment.gameofthrones.model.Places;

public class DAO {
	
	public ArrayList<Battle> getBattle() {
		ArrayList<Battle> listBattle = new ArrayList<>();
	    Connection connection = DBUtils.getConnection();
	        try {
	        	
	        	
	            Statement stmt = connection.createStatement();
	            ResultSet rs = stmt.executeQuery("SELECT * FROM battleplaces");
	      
	            while(rs.next())
	            {
	            	Battle battle = new Battle();
	            	
	            	battle.setName( rs.getString(1) );
	            	battle.setYear(rs.getInt(2));
	            	battle.setBattle_number(rs.getInt(3));
	            	battle.setBattle_type(rs.getString(4));
	            	battle.setMajor_death(rs.getInt(5));
	            	battle.setMajor_capture(rs.getInt(6));
	            	battle.setSummer(rs.getInt(7));
	            	battle.setLocation(rs.getString(8));
	            	battle.setRegion(rs.getString(9));
	            	battle.setNote(rs.getString(10));
	                listBattle.add(battle);
	            }
	           
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        } 
	        return listBattle;
	}
	
	
	public Battle getBattle(int battle_number) {
		Battle battle = new Battle();
		Connection connection = DBUtils.getConnection();
	        try {
	        	
	        	
	            Statement stmt = connection.createStatement();
	            ResultSet rs = stmt.executeQuery("SELECT * FROM battleplaces where battle_number =" + battle_number);
	      
	            if(rs.next())
	            {
	            	battle.setName(rs.getString(1));
	            	battle.setYear(rs.getInt(2));
	            	battle.setBattle_number(rs.getInt(3));
	            	battle.setBattle_type(rs.getString(4));
	            	battle.setMajor_death(rs.getInt(5));
	            	battle.setMajor_capture(rs.getInt(6));
	            	battle.setSummer(rs.getInt(7));
	            	battle.setLocation(rs.getString(8));
	            	battle.setRegion(rs.getString(9));
	            	battle.setNote(rs.getString(10));
	            }
	            
	           
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        } 
	        return battle;
	}
	
	public List<Places> getPlacesList(){
		ArrayList<Places> listPlaces = new ArrayList<>();
	    Connection connection = DBUtils.getConnection();
	        try {
	        	
	        	
	            Statement stmt = connection.createStatement();
	            ResultSet rs = stmt.executeQuery("SELECT region,location FROM battleplaces");
	      
	            while(rs.next())
	            {
	            	Places places= new Places();
	            	
	            	places.setRegion(rs.getString(1));
	            	places.setLocation(rs.getString(2));
	            	listPlaces.add(places);
	            }
	           
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        } 
	        return listPlaces;
	}


	public int getBattleCount() {
		ArrayList<Battle> listBattle = new ArrayList<>();
	    Connection connection = DBUtils.getConnection();
	        try {
	        	
	        	
	            Statement stmt = connection.createStatement();
	            ResultSet rs = stmt.executeQuery("SELECT * FROM battleplaces");
	      
	            while(rs.next())
	            {
	            	Battle battle = new Battle();
	            	
	            	battle.setName( rs.getString(1) );
	            	battle.setYear(rs.getInt(2));
	            	battle.setBattle_number(rs.getInt(3));
	            	battle.setBattle_type(rs.getString(4));
	            	battle.setMajor_death(rs.getInt(5));
	            	battle.setMajor_capture(rs.getInt(6));
	            	battle.setSummer(rs.getInt(7));
	            	battle.setLocation(rs.getString(8));
	            	battle.setRegion(rs.getString(9));
	            	battle.setNote(rs.getString(10));
	                listBattle.add(battle);
	            }
	           
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        } 
	        return listBattle.size();
		
	}
	
	
}
