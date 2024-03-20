package com.GamingService.Leaderboard.Services;

import java.util.List;

import com.GamingService.Leaderboard.Entities.playerInfo;

public interface LeaderboardService {
	public List<playerInfo> getTopFivePlayer();
	public playerInfo addPlayerIdAndScore(playerInfo info);
	public List<playerInfo> addPlayerIdAndScore(List<playerInfo> infoList);
	
}
