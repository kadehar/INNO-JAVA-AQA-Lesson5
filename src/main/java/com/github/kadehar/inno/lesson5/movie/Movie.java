package com.github.kadehar.inno.lesson5.movie;

public class Movie {
    private final String name;
    private double rate;
    private final Genre genre;
    private final String country;
    private final boolean hasOskar;

    public Movie(String name, Genre genre, String country, double rate, boolean hasOskar) {
        this.name = name;
        this.genre = genre;
        this.country = country;
        this.hasOskar = hasOskar;
        this.rate = rate;
    }

    public void changeRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        String oskar = hasOskar ? "есть" : "нет";
        return String.format("Название: %s\nЖанр: %s\nРейтинг: %.2f\nСтрана: %s\nОскар: %s",
                name, genre, rate, country, oskar);
    }
}
