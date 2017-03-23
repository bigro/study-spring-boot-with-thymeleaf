package com.example;

/**
 * Created by ooguro on 2017/03/23.
 */
public class CriteriaForm {
    HardwareType hardwareType;
    NewUsedType newUsedType;
    GenreType genre;

    public CriteriaForm(HardwareType hardwareType, NewUsedType newUsedType, GenreType genre) {
        this.hardwareType = hardwareType;
        this.newUsedType = newUsedType;
        this.genre = genre;
    }

    public CriteriaForm() {
    }

    public HardwareType getHardwareType() {
        return hardwareType;
    }

    public NewUsedType getNewUsedType() {
        return newUsedType;
    }

    public GenreType getGenre() {
        return genre;
    }
}
