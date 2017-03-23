package com.example;

/**
 * Created by ooguro on 2017/03/22.
 */
public class Game {
    String id;
    String name;
    NewUsedType newUsedType = NewUsedType.新品;
    HardwareType hardware;
    GenreType genre;

    public Game() {
    }

    public Game(String id, String name, NewUsedType newUsedType, HardwareType hardware, GenreType genre) {
        this.id = id;
        this.name = name;
        this.newUsedType = newUsedType;
        this.hardware = hardware;
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public NewUsedType getNewUsedType() {
        return newUsedType;
    }

    public GenreType getGenre() {
        return genre;
    }

    public HardwareType getHardware() {
        return hardware;
    }
}
