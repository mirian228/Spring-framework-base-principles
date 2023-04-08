package com.newproj.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newproj.spring.animal.AnimalSounds;
import com.newproj.spring.music.ClassicalMusic;
import com.newproj.spring.music.Music;
import com.newproj.spring.music.MusicPlayer;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// IMusic music = context.getBean("musicBean", IMusic.class);
		// MusicPlayer musicPlayer = new MusicPlayer(music);

		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer.playMusicList();
		System.out.println(musicPlayer.getName());
		System.out.println(musicPlayer.getVolume());
		
		System.out.println("Scope = prototype: Check");
		boolean comparison = musicPlayer == musicPlayer2;
		System.out.println(comparison);
		System.out.println(musicPlayer);
		System.out.println(musicPlayer2);
		musicPlayer2.playMusic(Music.ClassicalMusic);

		AnimalSounds animalSounds = context.getBean("animalSounds", AnimalSounds.class);
		animalSounds.getAnimalSound();

		ClassicalMusic classicalMusic = context.getBean("musicBeanClassical", ClassicalMusic.class);
		System.out.println(classicalMusic.getSong());
		
		
		context.close();

	}
}
