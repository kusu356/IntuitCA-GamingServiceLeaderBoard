package com.GamingService.Leaderboard.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.GamingService.Leaderboard.Entities.playerInfo;

public interface LeaderboardDao extends JpaRepository<playerInfo,String>{
	 @Query(value = "SELECT * FROM player_info ORDER BY player_score DESC LIMIT 5", nativeQuery = true)
	  List<playerInfo> findTopFivePlayers();

}
