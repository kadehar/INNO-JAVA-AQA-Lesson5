package com.github.kadehar.inno.lesson5.tournament;

import com.github.kadehar.inno.lesson5.player.Player;

import java.util.HashMap;
import java.util.Map;

public class PointsTask {
    public static void main(String[] args) {
        Map<Player, Integer> points = new HashMap<>() {{
            put(new Player(1, "nick020_bro"), 0);
            put(new Player(2, "mart1M0rt@L"), 0);
            put(new Player(3, "gargantua"), 0);
            put(new Player(4, "bARRaCUDA"), 0);
            put(new Player(5, "naGIGABYTE"), 0);
            put(new Player(6, "gRR@nA__T"), 0);
            put(new Player(7, "pe0pleL0v3r"), 0);
            put(new Player(8, "n0rm@n_OSborn3000"), 0);
            put(new Player(9, "sp11d3r40k"), 0);
            put(new Player(10, "slim_Takeshi43"), 0);
        }};
        points.put(new Player(4, "bARRaCUDA"), 10);
        points.put(new Player(7, "pe0pleL0v3r"), 12);
        points.put(new Player(8, "n0rm@n_OSborn3000"), 11);
        points.put(new Player(9, "sp11d3r40k"), 13);
        points.put(new Player(10, "slim_Takeshi43"), 5);
        points.entrySet().stream()
                .sorted(Map.Entry.<Player, Integer>comparingByValue().reversed())
                .limit(3)
                .map(e -> String.format("%s %d points", e.getKey().getNickname(), e.getValue()))
                .forEach(System.out::println);
    }
}