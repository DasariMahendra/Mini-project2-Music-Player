package com;

import java.util.*;

public class MusicPlayer {

	private ArrayList<Song> allSongs = new ArrayList<Song>();
	private ArrayList<Playlist> playlists = new ArrayList<Playlist>();
	
	public void addSong(Song song){
		allSongs.add(song);
	}
	
	public void updateSong(String title, Song newSongData) {
		
		for(Song s: allSongs){
			if(s.getTitle().equalsIgnoreCase(title)) {
				s.setSongId(newSongData.getSongId());
				s.setTitle(newSongData.getTitle());
				s.setArtist(newSongData.getArtist());
				s.setDuration(newSongData.getDuration());
				
				System.out.println("Song Title Updated Successfully");
				System.out.println(s);
				return;
			}
		}
		System.out.println("Song with Title" +title +" not found");;
	}
	
	
	public void deleteSong(String title) {
		
		Iterator<Song> iterator = allSongs.iterator();
		
	    while (iterator.hasNext()) {
	        Song song = iterator.next();
	        if (song.getTitle().equalsIgnoreCase(title)) {
	            iterator.remove();
	            System.out.println("Song "+title+" deleted Successfully");
	            return;
	        }
	    }
	    System.out.println("Song with title "+title+" not found");
	}
	
	public void displayAllSongs() {
		
		if(allSongs.isEmpty()) {
			System.out.println("No songs in libraray");
		}
		else {
			for(Song s: allSongs) {
				System.out.println(s);
			}
		}
	}
	
	public void createPlaylist(int playlistId,String name) {
		
		for(Playlist p: playlists) {
			if(p.getPlaylistName().equalsIgnoreCase(name)) {
				System.out.println("Playlist "+name+" already exists");
				return;
			}
		}
		playlists.add(new Playlist(name));
		System.out.println("Playlist "+name+" created Successfully");
	}
	
	public void addSongToPlaylist(String playlistName, String songTitle) {
	    Playlist playlist = getPlaylist(playlistName);

	    if (playlist == null) {
	        System.out.println("Playlist " + playlistName + " not found.");
	        return;
	    }

	    for (int i = 0; i < allSongs.size(); i++) {
	        Song song = allSongs.get(i);
	        if (song.getTitle().equalsIgnoreCase(songTitle)) {
	            playlist.addSong(song);
	            System.out.println("Song " + song.getTitle() + " added to playlist " + playlistName);
	            return;
	        }
	    }

	    System.out.println("Song " + songTitle + " not found in the song list.");
	}

	
	public void deletePlaylist(String name) {
		
		Iterator<Playlist> iterator = playlists.iterator();
	    while (iterator.hasNext()) {
	        Playlist playlist = iterator.next();
	        if (playlist.getPlaylistName().equalsIgnoreCase(name)) {
	            iterator.remove();
	            System.out.println("Playlist "+name+" deleted Successfully");
	            return;
	        }
	    }
	    System.out.println("Playlist "+name+" not found");
	}
	
	public void playPlaylist(String name) {
		
		Playlist playlist = getPlaylist(name);
		if(playlist != null) {
			System.out.println("Now playing playlist: "+name);
			for(Song song: playlist.getSongs()) {
				System.out.println("Playing: "+song.getTitle());
			}
		}
		else {
			System.out.println("Playlist "+name+" not found");
		}
	}
	
	public Playlist getPlaylist(String name) {
		
		for(Playlist playlist: playlists) {
			if(playlist.getPlaylistName().equalsIgnoreCase(name)) {
				return playlist;
			}
		}
		return null;
		
	}
	
	public void displayAllPlaylists() {
		
		if(playlists.isEmpty()) {
			System.out.println("Playlist is empty");
		}
		else {
			for(Playlist p: playlists) {
				System.out.println(p);
			}
		}
	}
}
