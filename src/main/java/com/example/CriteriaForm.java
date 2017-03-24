package com.example;

import java.util.Objects;

/**
 * Created by ooguro on 2017/03/23.
 */
public class CriteriaForm {
    HardwareType hardwareType = HardwareType.NONE;
    NewUsedType newUsedType = NewUsedType.新品;
    GenreType genre = GenreType.RPG;

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

    public boolean newUsedTypeIsEmpty() {
        return Objects.isNull(newUsedType);
    }

    public boolean genreIsEmpty() {
        return Objects.isNull(genre);
    }

    public void setHardwareType(HardwareType hardwareType) {
        this.hardwareType = hardwareType;
    }

    public void setNewUsedType(NewUsedType newUsedType) {
        this.newUsedType = newUsedType;
    }

    public void setGenre(GenreType genre) {
        this.genre = genre;
    }
}
