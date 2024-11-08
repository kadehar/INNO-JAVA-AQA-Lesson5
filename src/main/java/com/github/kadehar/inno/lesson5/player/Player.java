package com.github.kadehar.inno.lesson5.player;

import java.util.Objects;

public class Player {
    private final int id;
    private String nickname;
    private boolean isOnline;

    public Player(int id, String nickname, boolean isOnline) {
        this.id = id;
        this.nickname = nickname;
        this.isOnline = isOnline;
    }

    public Player(int id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && isOnline == player.isOnline && Objects.equals(nickname, player.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, isOnline);
    }

    @Override
    public String toString() {
        String status = isOnline ? "online" : "offline";
        return String.format("id: %d, nickname: %s, status: %s", id, nickname, status);
    }

    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }
}
