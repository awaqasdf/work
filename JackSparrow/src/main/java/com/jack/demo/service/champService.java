package com.jack.demo.service;

import com.jack.demo.dto.champDto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface champService {
	//public Flux<champDto>getProduct();
	//public Flux<champDto>getProductInRange(double min,double max);
	public Mono<champDto>saveProduct(Mono<champDto> champDtoMono);
	//public Mono<champDto>updateProduct(Mono<champDto> champMono,String id);
	//public Mono<Void>deleteProduct(String id);
}
