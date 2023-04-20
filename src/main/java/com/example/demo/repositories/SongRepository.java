package com.example.demo.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.demo.entities.Song;

public class SongRepository implements ISongRepository {

    // *Create Variables
    private final Map<Long, Song> songMap;
    private Long autoIncrement = 1L;

    // *initialize map
    public SongRepository() {
        songMap = new HashMap<Long, Song>();
    }

    // *Add songs to map
    @Override
    public Song add(Song song) {
        Song s = new Song(song.getName(), song.getGenre(), autoIncrement);
        songMap.put(autoIncrement, s);
        ++autoIncrement;
        return s;
    }

    // * check if song exists
    @Override
    public boolean existsById(Long id) {
        return songMap.containsKey(id);
    }

    // *find song by id
    @Override
    public Optional<Song> findById(Long id) {
        return Optional.ofNullable(songMap.get(id));
    }

    // *find all songs
    @Override
    public List<Song> findAll() {
        return songMap.values().stream().collect(Collectors.toList());
    }

    // *delete songs by id
    @Override
    public void deleteById(Long id) {
        songMap.remove(id);
    }

    // *count songs
    @Override
    public long count() {
        return songMap.size();
    }

}
