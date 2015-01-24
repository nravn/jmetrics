package org.jmetrics.internal.core;

import java.util.concurrent.atomic.AtomicLong;

final class Counter implements org.jmetrics.api.Counter {

    private final AtomicLong count = new AtomicLong(0);

    @Override
    public void increment() {
       count.incrementAndGet();
    }

    @Override
    public long value() {
        return count.get();
    }

    @Override
    public void reset() {
        count.set(0);
    }
}
