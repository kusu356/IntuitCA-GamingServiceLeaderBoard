package com.GamingService.Leaderboard.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GamingService.Leaderboard.Dao.LeaderboardDao;
import com.GamingService.Leaderboard.Entities.playerInfo;


@Service
public class LeaderboardServiceImpl implements LeaderboardService 
{
	@Autowired
	private LeaderboardDao leaderboardDao;
	List<playerInfo> list;
    public LeaderboardServiceImpl()
  {
//    	list=new ArrayList<>();
//
//    	list.add(new playerInfo("Player2",100));
//    	list.add(new playerInfo("Player3",850));   
//    	list.add(new playerInfo("Player4",100));
//
//    	list.add(new playerInfo("Player6",800));
//    	
    }  
    @Override                                                                                     
 
	public List<playerInfo> getTopFivePlayer() 
	{ 

		return leaderboardDao.findTopFivePlayers();
		// TODO Auto-generated method stub
		//return list;
	}


	@Override
	public playerInfo addPlayerIdAndScore(playerInfo info) 
	{
		return  leaderboardDao.save(info);
		//list.add(info);
		//return info;
	}
	@Override
	public List<playerInfo> addPlayerIdAndScore(List<playerInfo> infoList)
	{ 
		List<playerInfo> savedInfoList = new ArrayList<>();

          for (playerInfo info : infoList) 
          {
              savedInfoList.add(leaderboardDao.save(info));
	      }
          return savedInfoList;
     }      
}









