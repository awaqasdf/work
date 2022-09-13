package com.jack.demo.utils;

import org.springframework.beans.BeanUtils;

import com.jack.demo.dto.champDto;
import com.jack.demo.entity.champEntity;

public class champUtils {

	public static champDto entityToDto(champEntity champ) {
		champDto champdto=new champDto();
		BeanUtils.copyProperties(champ, champdto);
		return champdto;
		}

	public static champEntity dtoToEntity(champDto champdto) {
		champEntity champ=new champEntity();
		BeanUtils.copyProperties(champdto, champ);
		return champ;
		}
	
}
