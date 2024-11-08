package com.github.kadehar.inno.lesson5.company;

import java.util.ArrayList;
import java.util.List;

public class CompanyTask {
    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>() {{
            add(new Company("Blumhouse Productions", 2000));
            add(new Company("Paramount Pictures", 1912));
            add(new Company("Universal Pictures", 1912));
        }};

        List<String> blumhouseMovies = companies.getFirst().movies();
        blumhouseMovies.add("Five Nights At Freddy's");
        blumhouseMovies.add("Speak no evil");
        blumhouseMovies.add("Afraid");

        List<String> paramountMovies = companies.get(1).movies();
        paramountMovies.add("Down to Earth");
        paramountMovies.add("Lara Croft: Tomb Raider");
        paramountMovies.add("School of Rock");

        List<String> universalMovies = companies.getLast().movies();
        universalMovies.add("The Mummy");
        universalMovies.add("Halloween");
        universalMovies.add("Psycho");

        companies.forEach(System.out::println);
    }
}
