package com.jack.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Range;
import org.springframework.stereotype.Service;

import com.jack.demo.dto.champDto;
import com.jack.demo.repository.champRepository;
import com.jack.demo.utils.champUtils;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class champServiceImpl implements champService {
	@Autowired
	private champRepository champrepository;
	
	//public Flux<champDto>getProduct(){
	//	return champrepository.findAll().map(champUtils::entityToDto);
	//}
	//public Flux<champDto>getProductInRange(double min,double max){
	//	return champrepository.findByPriceBetween(Range.closed(min, max));
		
//	}
	public Mono<champDto>saveProduct(Mono<champDto> champDtoMono){
		return champDtoMono.map(champUtils::dtoToEntity).flatMap(champrepository::insert)
		.map(champUtils::entityToDto);
	}
//	public Mono<champDto>updateProduct(Mono<champDto> jackDtoMono,String id){
//		return champrepository.findById(id).flatMap(p->jackDtoMono.map(champUtils::dtoToEntity)
//				.doOnNext(e->e.setId(id)))
//				.flatMap(champrepository::save)
//				.map(champUtils::entityToDto);
//		
//	}
	
//	public Mono<Void>deleteProduct(String id){
//		return champrepository.deleteById(id);		
//	}

}
