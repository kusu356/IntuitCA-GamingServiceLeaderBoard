package com.GamingService.Leaderboard.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class playerInfo 
{
	@Id
	private String playerId;
	private int playerScore;
	
	public String getPlayerId() {
		return playerId;
	}
	@Override
	public String toString() {
		return "playerInfo [playerId=" + playerId + ", playerScore=" + playerScore + "]";
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public int getPlayerScore() {
		return playerScore;
	}
	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}
	public playerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public playerInfo(String playerId, int playerScore) {
		super();
		this.playerId = playerId;
		this.playerScore = playerScore;
	}
}
