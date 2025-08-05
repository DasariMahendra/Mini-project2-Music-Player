# 🎵 Music Player Application - Java Console Application

## Java Mini Project | FLM
---

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Usage](#usage)
  - [Add New Song](#add-new-song)
  - [Update Existing Song](#update-existing-song)
  - [Delete Song](#delete-song)
  - [Display All Songs](#display-all-songs)
  - [Create New Playlist](#create-new-playlist)
  - [Add Song to Playlist](#add-song-to-playlist)
  - [Display All Playlists](#display-all-playlists)
  - [Display Songs in Playlist](#display-songs-in-playlist)
  - [Play Song in Playlist](#play-song-in-playlist)
  - [Pause Song in Playlist](#pause-song-in-playlist)
  - [Stop Song in Playlist](#stop-song-in-playlist)
  - [Exit](#exit)
- [Classes and Interfaces](#classes-and-interfaces)
  - [Main](#main)
  - [MusicPlayer](#musicplayer)
  - [Playable](#playable)
  - [Playlist](#playlist)
  - [Song](#song)

## 🎧 Introduction

The Music Player Application is a console-based application that allows users to manage a music library and create playlists. Users can add, update, and delete songs, as well as create and manage playlists.

## Features

- 🎶 Add new songs to the music library
- 📝 Update or delete existing songs
- 📄 View all songs in the music library
- 📁 Create and manage multiple playlists
- ➕ Add songs to playlists
- 📂 Display songs in a playlist
- ▶️ Simulate play, pause, and stop actions on songs
- ❌ Exit the application

## 🕹️ Usage

The application provides a menu-driven interface for users to interact with the music player. Here's how you can use the different features:

### Add New Song

1. Select option 1 from the main menu.
2. Enter the song ID, title, artist, and duration.
3. The song will be added to the music library.

### Update Existing Song

1. Select option 2 from the main menu.
2. Enter the title of the song you want to update.
3. Enter the new song ID, title, artist, and duration.
4. The song will be updated in the music library.

### Delete Song

1. Select option 3 from the main menu.
2. Enter the title of the song you want to delete.
3. The song will be removed from the music library.

### Display All Songs

1. Select option 4 from the main menu.
2. All songs in the music library will be displayed.

### Create New Playlist

1. Select option 5 from the main menu.
2. Enter the playlist ID and name.
3. The new playlist will be created.

### Add Song to Playlist

1. Select option 6 from the main menu.
2. Enter the name of the playlist you want to add the song to.
3. Enter the title of the song you want to add.
4. The song will be added to the specified playlist.

### Display All Playlists

1. Select option 7 from the main menu.
2. All playlists will be displayed.

### Display Songs in Playlist

1. Select option 8 from the main menu.
2. Enter the name of the playlist you want to display.
3. All songs in the specified playlist will be displayed.

### Play Song in Playlist

1. Select option 9 from the main menu.
2. Enter the name of the playlist you want to play.
3. Enter the title of the song you want to play.
4. The specified song will start playing.

### Pause Song in Playlist

1. Select option 10 from the main menu.
2. Enter the name of the playlist you want to pause.
3. Enter the title of the song you want to pause.
4. The specified song will be paused.

### Stop Song in Playlist

1. Select option 11 from the main menu.
2. Enter the name of the playlist you want to stop.
3. Enter the title of the song you want to stop.
4. The specified song will be stopped.

### Exit

1. Select option 12 from the main menu.
2. The application will exit.

## Classes and Interfaces

### Main

The `Main` class is the entry point of the application. It provides the main menu and handles user input to interact with the `MusicPlayer` class.

### MusicPlayer

The `MusicPlayer` class is the core of the application. It manages the music library and playlists, providing methods to add, update, delete, and display songs and playlists.

### Playable

The `Playable` interface defines the methods for playing, pausing, and stopping songs in a playlist.

### Playlist

The `Playlist` class represents a playlist and implements the `Playable` interface. It manages the songs in the playlist and provides methods to add, remove, and display songs.

### Song

The `Song` class represents a song and contains information such as the song ID, title, artist, and duration.
