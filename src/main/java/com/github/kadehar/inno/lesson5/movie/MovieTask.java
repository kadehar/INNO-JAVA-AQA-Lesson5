package com.github.kadehar.inno.lesson5.movie;

import java.util.ArrayList;
import java.util.List;

public class MovieTask {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>() {{
            add(new Movie(
                    "Король говорит!",
                    Genre.Biopic,
                    "Великобритания",
                    8.0,
                    true
            ));
            add(new Movie(
                    "Чужой",
                    Genre.Horror,
                    "Великобритания",
                    8.1,
                    true
            ));
            add(new Movie(
                    "Воровка книг",
                    Genre.Military,
                    "Великобритания",
                    7.8,
                    false
            ));
        }};
        System.out.println(movies.get(1));
    }
}
