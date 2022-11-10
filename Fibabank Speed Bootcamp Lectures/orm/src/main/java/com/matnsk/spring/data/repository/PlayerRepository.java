package com.matnsk.spring.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.matnsk.spring.data.entity.Player;

public interface PlayerRepository extends CrudRepository<Player, Long>{
	
	
	@Query("select p from Player p where p.team.teamId = :teamId")
	List<Player> findAllByTeamId(long teamId);

}
