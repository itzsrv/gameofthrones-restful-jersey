package org.saurav.assignment.gameofthrones.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.saurav.assignment.gameofthrones.model.Battle;
import org.saurav.assignment.gameofthrones.model.Places;
import org.saurav.assignment.gameofthrones.service.BattleService;

@Path("/battles")
public class BattleResource {

	BattleService battleService = new BattleService();
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Battle> getBattles() {
		return battleService.getBattles();
	}
	
	
	@GET
	@Path("/{battleId}")
    @Produces(MediaType.APPLICATION_JSON)
	public Battle getBattles(@PathParam("battleId") int battleId) {
		return battleService.getBattle(battleId);
	}
	
	
	@GET
	@Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
	public  List<Places> getBattleList() {
		return battleService.getBattleList();
	}
	
	@GET
	@Path("/count")
    @Produces(MediaType.APPLICATION_JSON)
	public  int getBattleCount() {
		return battleService.getBattleCount();
	}
	
	
}
