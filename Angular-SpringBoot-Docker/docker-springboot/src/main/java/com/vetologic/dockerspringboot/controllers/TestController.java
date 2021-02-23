package com.vetologic.dockerspringboot.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vetologic.dockerspringboot.bean.ContentBean;
import com.vetologic.dockerspringboot.exceptions.ContentNotFoundException;
import com.vetologic.dockerspringboot.service.ContentService;

@RestController
@CrossOrigin(originPatterns = "*", allowedHeaders = "*", allowCredentials = "true")
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	ContentService contentService;
	
	@GetMapping(path="/get-content/{id}")
	public Map<String, String> getContent(@PathVariable("id") int contentId) {
		Optional<ContentBean> content= contentService.getContent(contentId);
		Map<String, String> response = new HashMap<String, String>();
		if(content.isPresent()) {
			response.put("content", content.get().getContent());
			return response;
		}
		
		throw new ContentNotFoundException("Content Not Found For Given Id");
	}
	
	@PostMapping(path="/add-content")
	public Map<String, String> addContent(@RequestBody ContentBean content) {
		contentService.createContent(content);
		Map<String, String> response = new HashMap<String, String>();
		response.put("message", "Content Created @ "+content.getContentId());
		return response;
	}
}
