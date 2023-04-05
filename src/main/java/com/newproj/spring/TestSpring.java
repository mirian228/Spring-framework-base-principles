package com.newproj.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newproj.spring.music.IMusic;
import com.newproj.spring.music.MusicPlayer;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IMusic music = context.getBean("musicBean", IMusic.class);

		MusicPlayer musicPlayer = new MusicPlayer(music);

		musicPlayer.playMusic();

		context.close();

	}
}
