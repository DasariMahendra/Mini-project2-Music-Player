package com;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		MusicPlayer player = new MusicPlayer();
        Scanner sc = new Scanner(System.in);

        while (true) {
        	try {
	            System.out.println("\n========= MUSIC PLAYER MENU =========");
	            System.out.println("1. Add New Song");
	            System.out.println("2. Update Existing Song");
	            System.out.println("3. Delete Song");
	            System.out.println("4. Display All Songs");
	            System.out.println("5. Create New Playlist");
	            System.out.println("6. Add Song to Playlist");
	            System.out.println("7. Display All Playlists");
	            System.out.println("8. Display Songs in Playlist");
	            System.out.println("9. Play Song in Playlist");
	            System.out.println("10. Pause Song in Playlist");
	            System.out.println("11. Stop Song in Playlist");
	            System.out.println("12. Exit");
	            System.out.print("Enter your choice: ");
	            
	            int choice = sc.nextInt();
	            sc.nextLine(); 
	            
	            switch (choice) {
	                case 1 :
	                    System.out.print("Enter Song ID: ");
	                    int id = sc.nextInt(); 
	                    sc.nextLine();
	                    
	                    System.out.print("Enter Title for the Song: ");
	                    String title = sc.nextLine();
	                    
	                    System.out.print("Enter Artist for the Song: ");
	                    String artist = sc.nextLine();
	                    
	                    System.out.print("Enter Duration (in mins) for the Song: ");
	                    double duration = sc.nextDouble();
	                    
	                    sc.nextLine();
	                    
	                    player.addSong(new Song(id, title, artist, duration));
	                    System.out.println("Song Added Successfully.");
	                    break;
	                
	                case 2 : 
	                    System.out.print("Enter Title of Song to Update: ");
	                    String oldTitle = sc.nextLine();
	                    
	                    System.out.print("Enter New Song ID: ");
	                    int newId = sc.nextInt(); 
	                    sc.nextLine();
	                    
	                    System.out.print("Enter New Title for the Song: ");
	                    String newTitle = sc.nextLine();
	                    
	                    System.out.print("Enter New Artist for the Song: ");
	                    String newArtist = sc.nextLine();
	                    
	                    System.out.print("Enter New Duration for the Song: ");
	                    double newDuration = sc.nextDouble(); 
	                    
	                    sc.nextLine();
	                    player.updateSong(oldTitle, new Song(newId, newTitle, newArtist, newDuration));
	                    System.out.println("Song Successfully Updated.");
	                    break;
	                    
	                case 3 : 
	                    System.out.print("Enter Song Title to Delete: ");
	                    String delTitle = sc.nextLine();
	                    
	                    player.deleteSong(delTitle);
	                    System.out.println("Song Deleted");
	                    break;
	             
	                case 4 :
	                	player.displayAllSongs();
	                	break;
	                	
	                case 5 :
	                	System.out.print("Enter Playlist ID: ");
	                    int plId = sc.nextInt();
	                    
	                    sc.nextLine();
	                    System.out.println("Enter Playlist name: ");
	                    String plName = sc.nextLine();
	                    
	                    player.createPlaylist(plId,plName);
	                    System.out.println("Songs Playlist Created.");
	                    System.out.println("Add Songs to playlist");
	                    break;
	                    
	                case 6 :
	                    System.out.print("Enter Playlist Name: ");
	                    String plToAdd = sc.nextLine();
	                    
	                    System.out.print("Enter Song Title to Add: ");
	                    String songTitle = sc.nextLine();
	                    
	                    player.addSongToPlaylist(plToAdd,songTitle);
	                    System.out.println("Song Added to Playlist.");
	                    break;
	                    
	                case 7 : 
	                	player.displayAllPlaylists();
	                	break;
	                	
	                case 8 :
	                    System.out.print("Enter Playlist Name: ");
	                    String pToDisplay = sc.nextLine();
	                    
	                    Playlist plDisplay = player.getPlaylist(pToDisplay);
	                    if (plDisplay != null) {
	                    	plDisplay.displaySong();
	                    }
	                    else {
	                    	System.out.println("Playlist not found.");
	                    }
	                    break;
	                    
	                case 9 :
	                    System.out.print("Enter PlayList name: ");
	                    String plToPlay = sc.nextLine();
	                    
	                    System.out.println("Enter song Title to play: ");
	                    String playTitle = sc.nextLine();
	                    
	                    Playlist plPlay = player.getPlaylist(plToPlay);
	                    if (plPlay != null) {
	                    	plPlay.play(playTitle);
	                    }
	                    else {
	                    	System.out.println("Song not found in any playlist.");
	                    }
	                    break;
	                    
	                case 10 :
	                    System.out.print("Enter PlayList name: ");
	                    String plToPause = sc.nextLine();
	                    
	                    System.out.println("Enter song Title to pause: ");
	                    String pauseTitle = sc.nextLine();
	                    
	                    Playlist plPause = player.getPlaylist(plToPause);
	                    if (plToPause != null) {
	                    	plPause.pause(pauseTitle);
	                    }
	                    else {
	                    	System.out.println("Song not found in any playlist.");
	                    }
	                    break;
	                    
	                case 11 :
	                    System.out.print("Enter PlayList name: ");
	                    String plToStop = sc.nextLine();
	                    
	                    System.out.println("Enter song Title to stop: ");
	                    String stopTitle = sc.nextLine();
	                    
	                    Playlist plStop = player.getPlaylist(plToStop);
	                    if (plToStop != null) {
	                    	plStop.stop(stopTitle);
	                    }
	                    else {
	                    	System.out.println("Song not found in any playlist.");
	                    }
	                    break;
	                    
	                case 12 :
	                    System.out.println("Exiting Music Player...");
	                    sc.close();
	                    return;
	                    
	                default :
	                	System.out.println("Invalid choice. Try again.");
	            }	    
	        }
        	catch(Exception e) {
        		System.out.println(e.getMessage());
        	}
        }
	}
}
