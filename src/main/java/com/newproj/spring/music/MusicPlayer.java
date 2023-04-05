package com.newproj.spring.music;

public class MusicPlayer {
	private IMusic music;
	private String name;
	private int volume;

	// IoC ( Inversion of control)
	public MusicPlayer(IMusic music) {
		this.music = music;
	}

	public MusicPlayer() {

	}

	public void setMusic(IMusic music) {
		this.music = music;
	}

	public String getName() {
		return name;
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
		System.out.println("Playing: " + music.getSong());
	}
}
