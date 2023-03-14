package com.example.song.repository;

import com.example.song.model.Song;
import java.util.*;

public interface SongRepository{
    ArrayList<Song> getSongs();
    Song addSong(Song song);
    String addMultipleSongs(ArrayList<Song> multipleSongs);
    Song getSongById(int songId);
    Song updateSong(int songId, Song song);
    void deleteSong(int songId);
}
