package com.github.kadehar.inno.lesson5.company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private int establishedAt;
    private List<String> movies;

    public Company(String name, int establishedAt) {
        this.name = name;
        this.establishedAt = establishedAt;
        this.movies = new ArrayList<>();
    }

    public List<String> movies() {
        return movies;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", name, movies);
    }
}
