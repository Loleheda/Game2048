package com.pinchuk.java.main.board;

import java.util.List;

public class Board {
    private int weigh;
    private int height;

    public Board(int weigh, int height) {
        this.weigh = weigh;
        this.height = height;
    }

    abstract void fillBoard(List<Integer> list) {

    }

    abstract List<Key> availableSpace() {

    }

    abstract void addItem(Key key, Integer value) {
    }

    abstract Key getKey(int i, int j) {

    }

    abstract Integer getValue(Key key) {

    }

    abstract List<Key> getColumn(int j) {

    }

    abstract List<Key> getRow(int i) {

    }

    abstract boolean hasValue(Integer value) {

    }

    abstract List<Integer> getValues(List<Key> keys) {

    }
}
