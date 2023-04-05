package com.newproj.spring.music;

public class MusicPlayer {
	private IMusic music;

	// IoC ( Inversion of control)
	public MusicPlayer(IMusic music) {
		this.music = music;
	}

	public MusicPlayer() {

	}

	public void setMusic(IMusic music) {
		this.music = music;
	}

	public void playMusic() {
		System.out.println("Playing: " + music.getSong());
	}
}
