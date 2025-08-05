package com;

import java.util.*;

public class Playlist implements Playable{

	public int playlistId;
	public String playlistName;
	public ArrayList<Song> songs;
	
	public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.songs = new ArrayList<>();
    }
	
	@Override
	public void play(String title) {
		System.out.println(title +" Song is playing");
		
	}

	@Override
	public void play(int songId) {
		System.out.println(songId +" Song is playing");
		
	}

	@Override
	public void pause(String title) {
		System.out.println(title +" Song is paused");
		
	}

	@Override
	public void pause(int songId) {
		System.out.println(songId +" Song is paused");
		
	}

	@Override
	public void stop(String title) {
		System.out.println(title +" Song is stopped");
		
	}

	@Override
	public void stop(int songId) {
		System.out.println(songId +" Song is stopped");
		
	}

	public void addSong(Song song) {
		songs.add(song);
	}
	
	public void removeSong(String title) {
		
		Iterator<Song> iterator = songs.iterator();
	    while (iterator.hasNext()) {
	        Song song = iterator.next();
	        if (song.getTitle().equalsIgnoreCase(title)) {
	            iterator.remove();
	        }
	    }
	}
	
	public void removeSong(int songId) {
		
		Iterator<Song> iterator = songs.iterator();
	    while (iterator.hasNext()) {
	        Song song = iterator.next();
	        if (song.getSongId() == songId) {
	            iterator.remove();
	        }
	    }
	}
	
	public void displaySong() {
		if(songs.isEmpty()) {
			System.out.println("Playlist is empty");
		}
		else {
			for(Song song: songs) {
				System.out.println(song);
			}
		}
	}
	
	
	public Playlist(int playlistId, String playlistName) {
		this.playlistId = playlistId;
		this.playlistName = playlistName;
		this.songs = new ArrayList<Song>();
	}

	public int getPlaylistId() {
		return playlistId;
	}

	public void setPlaylistId(int playlistId) {
		this.playlistId = playlistId;
	}

	public String getPlaylistName() {
		return playlistName;
	}

	public void setPlaylistName(String playlistName) {
		this.playlistName = playlistName;
	}

	public ArrayList<Song> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}

	@Override
	public String toString() {
		return "Playlist [playlistId=" + playlistId + ", playlistName=" + playlistName + ", songs=" + songs + "]";
	}

	
}
