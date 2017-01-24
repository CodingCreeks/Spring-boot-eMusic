package com.codingKnowledge.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eMusicStore")
public class EMusicStoreRestController {

	@RequestMapping("/hello")
	public String hello() {
		return "Welcome to eMusic Store";
	}	
}