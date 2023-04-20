package com.example.demo.entities;

import java.util.Objects;

public class Song {

    // *Variable names
    private Long id;
    private String name;
    private String genre;

    // *Constructor with id
    public Song(String name, String genre, Long id) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    // *constructor without id
    public Song(String name, String genre) {
        this(name, genre, null);
    }

    // *Getter setters
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // *Generate Equal */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Song)) {
            return false;
        }
        Song songs = (Song) o;
        return Objects.equals(id, songs.id) && Objects.equals(name, songs.name) && Objects.equals(genre, songs.genre);
    }

    // * Generate Hash Code */
    @Override
    public int hashCode() {
        return Objects.hash(id, name, genre);
    }

    // * Generate toString */
    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", genre='" + getGenre() + "'" +
                "}";
    }

}