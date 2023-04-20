package com.example.demo.entities;

import java.util.Objects;

public class Playlist {

    // *Variable names
    private Long id;
    private String name;

    // *Constructor with id
    public Playlist(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // *constructor without id
    public Playlist(String name) {
        this(null, name);
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

    // *Generate Equal
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Playlist)) {
            return false;
        }
        Playlist playlist = (Playlist) o;
        return Objects.equals(id, playlist.id) && Objects.equals(name, playlist.name);
    }

    // * Generate Hash Code
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // * Generate toString
    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                "}";
    }

}
