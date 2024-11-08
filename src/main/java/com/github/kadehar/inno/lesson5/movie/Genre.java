package com.github.kadehar.inno.lesson5.movie;

public enum Genre {
    Military("Военный"),
    Biopic("Биография"),
    Horror("Ужасы");

    private final String name;

    Genre(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
