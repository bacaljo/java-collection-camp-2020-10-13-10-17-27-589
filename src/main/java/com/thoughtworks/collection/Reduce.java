package com.thoughtworks.collection;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        return arrayList.stream()
                .reduce(Integer::sum)
                .map(integer -> ((double) integer) / arrayList.size())
                .get();
    }

    public int getMaxValue() {
        return arrayList.stream()
                .reduce((maxValue, integer) -> integer > maxValue ? integer : maxValue)
                .get();
    }

    public int getLastOdd() {
        return arrayList.stream()
                .reduce((lastOdd, integer) -> integer % 2 != 0 ? integer : lastOdd)
                .get();
    }
}
