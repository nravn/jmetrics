package org.jmetrics.api;

public interface Counter extends Metric {
    public void increment();
    public long value();
}
