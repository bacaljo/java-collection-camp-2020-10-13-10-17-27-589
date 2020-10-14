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
                .map(integer -> ((double) integer) / arrayList.size()).get();
    }

    public int getMaxValue() {
        return arrayList.stream().reduce(0, (maxValue, integer) -> integer > maxValue ? integer : maxValue);
    }

    public int getLastOdd() {
        return arrayList.stream().reduce(0, (lastOdd, integer) -> integer % 2 != 0 ? integer : lastOdd);
    }
}
