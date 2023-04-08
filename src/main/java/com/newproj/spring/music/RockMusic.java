package com.newproj.spring.music;

import org.springframework.stereotype.Component;

@Component("musicBeanRock")
public class RockMusic implements IMusic {

	@Override
	public String getSong() {
		return "Wind cries Mary";
	}

}
