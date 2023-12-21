package com.updown.api.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.updown.api.dao.GameMapper;

@Service
public class GameService {
	
	@Autowired
	GameMapper gameMapper;

	public List<Map<String, Object>> getGameInfo() {
		return gameMapper.getGameInfo();
	}

}
