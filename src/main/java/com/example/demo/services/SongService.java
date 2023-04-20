package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Song;
import com.example.demo.repositories.ISongRepository;

public class SongService {

    // *Declaring repository variable
    private final ISongRepository songRepository;

    // *Constructor
    public SongService(ISongRepository songRepository) {
        this.songRepository = songRepository;
    }

    // *saving a song
    public Song add(String name, String genre) {
        Song s = new Song(name, genre);
        return songRepository.add(s);
    }

    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }

    public Song getSongById(Long id) {
        return songRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Song with id: " + id + " not found"));
    }
}
