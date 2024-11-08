package com.github.kadehar.inno.lesson5.playersstorage;

import com.github.kadehar.inno.lesson5.player.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayersStorage {
    private final List<Player> players = new ArrayList<>();

    public void add(Player player) {
        if (players.stream().noneMatch(it -> it.equals(player))) {
            players.add(player);
        }
    }

    public int size() {
        return players.size();
    }

    @Override
    public String toString() {
        return players.stream()
                .map(player -> String.format("{id: %d, nickname: %s}", player.getId(), player.getNickname()))
                .toList()
                .toString();
    }
}
