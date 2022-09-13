package com.jack.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jack.demo.dto.champDto;
import com.jack.demo.service.champService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class champController {
	@Autowired
	public champService champservice;
	
/*	@GetMapping("")
	public Flux<champDto> product(){
		return champservice.getProduct();
		
	}*/
	
	@PostMapping("/v1")
	public Mono<champDto>saveProduct(@RequestBody Mono<champDto> champDtoMono){
		return champservice.saveProduct(champDtoMono);
		
	}

}
