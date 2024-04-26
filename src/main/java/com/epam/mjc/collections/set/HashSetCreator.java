package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> resultList = new HashSet<>();

        for (Integer item : sourceList) {
            if (item % 2 == 0) {
                while (item % 2 == 0) {
                    resultList.add(item);
                    item /= 2;
                }
                resultList.add(item);
            } else {
                resultList.add(item);
                resultList.add(2 * item);
            }
        }

        return resultList;
    }
}
