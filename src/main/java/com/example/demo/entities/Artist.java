package com.example.demo.entities;

import java.util.Objects;

public class Artist {

    // *Variable names
    private Long id;
    private String name;

    // *Constructor with id
    public Artist(String name, Long id) {
        this.id = id;
        this.name = name;
    }

    // *constructor without id
    public Artist(String name) {
        this(name, null);
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

    // *Generate Equal */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Artist)) {
            return false;
        }
        Artist artists = (Artist) o;
        return Objects.equals(id, artists.id) && Objects.equals(name, artists.name);
    }

    // * Generate Hash Code */
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // * Generate toString */
    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                "}";
    }

}
