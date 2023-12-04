package com.pinchuk.main.boards;

import com.pinchuk.main.keys.Key;

import java.util.*;


public class SquareBoard extends Board{
    private int size;

    public SquareBoard(int size) {
        super(size, size);
        this.size = size;
    }

    @Override
    public void fillBoard(List<Integer> list) {
        board.clear();
        ListIterator<Integer> listIterator  = list.listIterator();
        for (int i=0; i < this.size; i++) {
            for (int j=0; j < this.size; j++) {
                if (listIterator.hasNext()) {
                    board.put(new Key(i, j), listIterator.next());
                    continue;
                }
                board.put(new Key(i,j), null);
            }
        }
    }

    @Override
    public List<Key> availableSpace() {
        List<Key> keys = new ArrayList<>();
        for (Key key: board.keySet()) {
            if (board.get(key) == null) {
                keys.add(key);
            }
        }
        return keys;
    }

    @Override
    public void addItem(Key key, Integer value) {
//        add
    }

    @Override
    public Key getKey(int i, int j) {
        for (Key key: board.keySet()) {
            if (key.getI() == i && key.getJ() == j) {
                return key;
            }
        }
        return null;
    }

    @Override
    public Integer getValue(Key key) {
        return board.get(key);
    }

    @Override
    public List<Key> getColumn(int j) {
        List<Key> keys = new ArrayList<>();
        for (Key key: board.keySet()) {
            if(key.getJ() == j) {
                keys.add(key);
            }
        }
        keys.sort(Comparator.comparing(Key::getJ));
        return keys;
    }

    @Override
    public List<Key> getRow(int i) {
        List<Key> keys = new ArrayList<>();
        for (Key key: board.keySet()) {
            if(key.getI() == i) {
                keys.add(key);
            }
        }
        keys.sort(Comparator.comparing(Key::getI));
        return keys;
    }

    @Override
    public boolean hasValue(Integer value) {
        int sum = 0;
        for (Integer val: board.values()) {
            if (val == null) continue;
            sum += val;
        }
        return sum == value;
    }

    @Override
    public List<Integer> getValues(List<Key> keys) {
        List<Integer> values = new ArrayList<>();
        for (Key key: keys) {
            values.add(board.get(key));
        }
        return values;
    }

}
