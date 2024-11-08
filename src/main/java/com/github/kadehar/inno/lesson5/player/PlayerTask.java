package com.github.kadehar.inno.lesson5.player;

public class PlayerTask {
    public static void main(String[] args) {
        Player nick = new Player(1, "nickilunion3000", true);
        Player t1000 = new Player(1, "nickilunion3000", true);
        System.out.println(nick == t1000);
        System.out.println(nick.equals(t1000));
    }
}
