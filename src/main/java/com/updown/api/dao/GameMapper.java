package com.updown.api.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GameMapper {

	List<Map<String, Object>> getGameInfo();

}
