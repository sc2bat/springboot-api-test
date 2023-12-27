package com.updown.api.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.updown.api.service.GameService;

@RestController
@RequestMapping("/game")
public class GameController {
	
	@Autowired
	GameService gameService;
	
	@GetMapping("/info")
	public List<Map<String, Object>> getGameInfo(){
		return gameService.getGameInfo();
	}

	@GetMapping("/image/sample")
	public ResponseEntity<byte[]> getImageSample() throws IOException{
		Resource resource = new ClassPathResource("/static/images/sample.png");
        byte[] imageBytes = Files.readAllBytes(Path.of(resource.getURI()));

        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
	}
	
	
	
}
