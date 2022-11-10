package com.matnsk.spring.presentation.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.matnsk.spring.data.entity.Player;
import com.matnsk.spring.data.repository.PlayerRepository;

@Controller
@RequestMapping("/sports")
public class PlayerController {
	
	@Autowired
	private PlayerRepository playerRepository;

	@GetMapping("/players/byteam")
	@ResponseBody
	public String getPlayersByTeamId()
	{
		long teamId = 5;
		List<Player> players = playerRepository.findAllByTeamId(teamId);
		double totalScore = 0;
		
		for(Player player: players) {
			System.out.println(player.getPlayerId()+" "+
					player.getPlayerName() + " " +
					player.getAverageScore());
			totalScore += player.getAverageScore();
		}
		
		double averageScore = totalScore/players.size();
		return "Average score: " + averageScore;
	}
	
}
