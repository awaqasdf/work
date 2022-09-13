package com.jack.demo.repository;

import org.springframework.data.domain.Range;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.jack.demo.dto.champDto;
import com.jack.demo.entity.champEntity;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Repository
public interface champRepository extends ReactiveMongoRepository<champEntity,String> {

	

	Flux<champDto> findByPriceBetween(Range<Double> closed);

}
