package com.pinchuk.main.boards;

import com.pinchuk.main.keys.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Board {
    private int weigh;
    private int height;
    private Map<Key, Integer> board;

    public Board(int weigh, int height) {
        this.weigh = weigh;
        this.height = height;
        this.board = new HashMap<>();
    }

    public abstract void fillBoard(List<Integer> list);

    public abstract List<Key> availableSpace();

    public abstract void addItem(Key key, Integer value);

    public abstract Key getKey(int i, int j);

    public abstract Integer getValue(Key key);

    public abstract List<Key> getColumn(int j);

    public abstract List<Key> getRow(int i);

    public abstract boolean hasValue(Integer value);

    public List<Integer> getValues(List<Key> keys) {
        return null;
    }
}