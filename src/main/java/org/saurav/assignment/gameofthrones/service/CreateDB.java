package org.saurav.assignment.gameofthrones.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CreateDB {
	public boolean parseData() throws IOException, SQLException {

		Connection connection = DBUtils.getConnection();

		String sql1 = " INSERT INTO battle(name, year, battle_number, battle_type, major_death, major_capture, summer, location, region, note) VALUES(?,?,?,?,?,?,?,?,?,?) ";
		String sql2 = " INSERT INTO defender(king, commander, defender1,defender2,defender3,defender4,size) VALUES(?,?,?,?,?,?,?)";
		String sql3 = " INSERT INTO attacker(king, commander, attacker1,attacker2,attacker3,attacker4,outcome,size) VALUES(?,?,?,?,?,?,?,?)";

		try {
			
			File file = new File("battles.csv");
			
			BufferedReader bReader = new BufferedReader(new FileReader(file));
			String line = ""; 
			while ((line = bReader.readLine()) != null) {
				try {

					if (line != null) 
					{
						String[] str = line.split(",+");
						for(String result:str)
						{
							System.out.println(result);
							PreparedStatement ps = connection.prepareStatement(sql1);
							ps.setString(1,(str[0]=="")?"unknown":str[0]);
							ps.setString(2,(str[1]=="")?"unknown":str[1]);
							ps.setString(3,(str[2]=="")?"unknown":str[2]);	
							ps.setString(4,(str[14]=="")?"unknown":str[14]);
							ps.setString(5,(str[15]=="")?"unknown":str[15]);
							ps.setString(6,(str[16]=="")?"unknown":str[16]);
							ps.setString(7,(str[21]=="")?"unknown":str[21]);
							ps.setString(8,(str[22]=="")?"unknown":str[22]);
							ps.setString(9,(str[23]=="")?"unknown":str[23]);
							ps.setString(10,(str[24]=="")?"unknown":str[24]);
							ps.executeLargeUpdate();
							ps.close();

						}
					} 
				}
				finally
				{
					if (bReader == null) 
					{
						bReader.close();
					}
				}
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		return true;
	}
	
}
