package com.GamingService.Leaderboard.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GamingService.Leaderboard.Entities.playerInfo;
import com.GamingService.Leaderboard.Services.LeaderboardService;


@RestController
public class LeaderboardController 
{
  
	@Autowired
	private LeaderboardService leaderboard;

	@GetMapping("/getTopFivePlayers")
	public List<playerInfo> getTopFivePlayer()
	{
		
		return this.leaderboard.getTopFivePlayer();
		
	}
	@PostMapping("/addPlayerIdAndScore")
	public ResponseEntity<playerInfo>  addPlayerIdAndScore(@RequestBody playerInfo info)
	{ 
	//
		try 
		{
		return ResponseEntity.ok(this.leaderboard.addPlayerIdAndScore(info));
		}
		catch(Exception e)
		{
			return (ResponseEntity<playerInfo>) ResponseEntity.internalServerError();
		}
		
	}
	 @PostMapping("/addPlayerIdAndScoreBatch")
	    public ResponseEntity< List<playerInfo> > addPlayerIdAndScoreBatch(@RequestBody List<playerInfo> infoList) {
	        try {
	    
	            return ResponseEntity.ok(this.leaderboard.addPlayerIdAndScore(infoList));
	        } catch (Exception e) 
	        {
	        	return (ResponseEntity< List<playerInfo> >) ResponseEntity.internalServerError();
	        }
	    }
	
}
