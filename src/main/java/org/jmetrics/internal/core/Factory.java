package org.jmetrics.internal.core;

public class Factory {
    private Factory() {}

    public static Counter getCounter(String name) {
        return new Counter();
    }
}
