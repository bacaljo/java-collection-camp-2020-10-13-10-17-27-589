package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        throw new NotImplementedException();
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
