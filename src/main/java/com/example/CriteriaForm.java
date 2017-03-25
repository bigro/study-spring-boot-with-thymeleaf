package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by ooguro on 2017/03/23.
 */
public class CriteriaForm {
    HardwareType hardwareType = HardwareType.NONE;
    NewUsedType newUsedType = NewUsedType.新品;
    List<GenreType> genres = new ArrayList<>();

    public CriteriaForm(HardwareType hardwareType, NewUsedType newUsedType, List<GenreType> genres) {
        this.hardwareType = hardwareType;
        this.newUsedType = newUsedType;
        this.genres = genres;
    }

    public CriteriaForm() {
    }

    public HardwareType getHardwareType() {
        return hardwareType;
    }

    public NewUsedType getNewUsedType() {
        return newUsedType;
    }

    public List<GenreType> getGenres() {
        return genres;
    }

    public boolean newUsedTypeIsEmpty() {
        return Objects.isNull(newUsedType);
    }

    public boolean genreIsEmpty() {
        return Objects.isNull(genres);
    }

    public void setHardwareType(HardwareType hardwareType) {
        this.hardwareType = hardwareType;
    }

    public void setNewUsedType(NewUsedType newUsedType) {
        this.newUsedType = newUsedType;
    }

    public void setGenres(List<GenreType> genres) {
        this.genres = genres;
    }
}
