package com.github.kadehar.inno.lesson5.playersstorage;

import com.github.kadehar.inno.lesson5.player.Player;

public class TournamentTask {
    public static void main(String[] args) {
        PlayersStorage storage = new PlayersStorage();
        storage.add(new Player(1, "nick020_bro", true));
        storage.add(new Player(1, "nick020_bro", true));
        storage.add(new Player(2, "mart1M0rt@L", false));
        storage.add(new Player(3, "gargantua", true));
        storage.add(new Player(4, "bARRaCUDA", false));
        storage.add(new Player(5, "naGIGABYTE", false));
        storage.add(new Player(6, "gRR@nA__T", false));
        storage.add(new Player(7, "pe0pleL0v3r", true));
        storage.add(new Player(8, "n0rm@n_OSborn3000", true));
        storage.add(new Player(9, "sp11d3r40k", true));
        storage.add(new Player(10, "slim_Takeshi43", true));

        System.out.printf("Размер хранилища: %d\nСодержимое: %s\n", storage.size(), storage);
    }
}
