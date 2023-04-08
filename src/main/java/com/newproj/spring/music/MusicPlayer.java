package com.newproj.spring.music;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class MusicPlayer {

	private List<IMusic> musicList = new ArrayList<IMusic>();
	private ClassicalMusic classicalMusic;
	private RockMusic rockMusic;
	private JazzMusic jazzMusic;
		//Using this annotation we can get values from properties file and use them for parameters
	@Value("${name}")
	private String name;
	@Value("${volume}")
	private int volume;

	// IoC ( Inversion of control)
	public MusicPlayer(List<IMusic> musicList) {
		this.musicList = musicList;
	}

	
	
	@Autowired
	public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, JazzMusic jazzMusic) {
		super();
		this.classicalMusic = classicalMusic;
		this.rockMusic = rockMusic;
		this.jazzMusic = jazzMusic;
	}




	public MusicPlayer() {

	}

	public String getName() {
		return name;
	}

	public void setMusicList(List<IMusic> musicList) {
		this.musicList = musicList;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void playMusic(Music genre) {
		Random random = new Random();
		
		int randomNumber = random.nextInt(3);
		
		if(genre == Music.ClassicalMusic) {
			System.out.println(classicalMusic.getSong()[randomNumber]);
		} if (genre == Music.RockMusic) {
			System.out.println(rockMusic.getSong()[randomNumber]);
		} if (genre == Music.JazzMusic) {
			System.out.println(jazzMusic.getSong()[randomNumber]);
		}
		else {

		}
		for (IMusic music : musicList) {
			System.out.println("Playing: " + music.getSong());
		}

	}
	
	public void playMusicList() {

		for (IMusic music : musicList) {
			for(int i=0; i<music.getArrayLength(); i++) {
			System.out.println("Playing: " + music.getSong()[i]);
			}
		}

	}
	
	
}
