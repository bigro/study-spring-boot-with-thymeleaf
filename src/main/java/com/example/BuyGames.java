package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ooguro on 2017/03/22.
 */
public class BuyGames {
    List<String> ids = new ArrayList<>();

    public BuyGames() {
    }

    public BuyGames(List<String> ids) {
        this.ids = ids;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }
}
