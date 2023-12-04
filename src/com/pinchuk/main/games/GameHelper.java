package com.pinchuk.main.games;

import java.util.List;

public class GameHelper {
    public List<Integer> moveAndMergeEqual(List<Integer> list) {
        list = listSort(list);
        int length = list.size()-1;
        for (int i=0; i < length; i++) {
            if (list.get(i) == list.get(i+1) && list.get(i) != null && list.get(i+1) != null) {
                list.set(i, list.get(i)*2);
                list.set(i+1, null);
            }
        }
        return listSort(list);
    }

    public List<Integer> listSort(List<Integer> list) {
        for (int j=0; j <  list.size(); j++) {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) == null) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }
        }
        return list;
    }

}
