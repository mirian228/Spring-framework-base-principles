package com.newproj.spring.music;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

	private List<IMusic> musicList = new ArrayList<IMusic>();

	private String name;
	private int volume;

	// IoC ( Inversion of control)
	public MusicPlayer(List<IMusic> musicList) {
		this.musicList = musicList;
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

	public void playMusic() {

		for (IMusic music : musicList) {
			System.out.println("Playing: " + music.getSong());
		}

	}
	
	
}
