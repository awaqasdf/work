package com.jack.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class champDto {
	private String id;
	private String statusCode;
	private String vin;
	private String transferType;

}
