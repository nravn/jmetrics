package org.jmetrics.api;

import org.jmetrics.internal.core.Factory;

public class MetricFactory {
    private MetricFactory() {}

    public static Counter getCounter(String name) {
        return Factory.getCounter(name);
    }
}
