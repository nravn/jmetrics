# Building
The project can be built and tested with maven:

    mvn clean test

It's suggested to use the checked in IntelliJ project files to get started quickly.

# Structure

## API
`org.jmetrics.api.MetricFactory` is the main entry point, providing static methods to create various metrics.
Everything else in `org.jmetrics.api` should be interfaces.

## Implementation
Implementation is done in `org.jmetrics.internal`.

## Tests
Tests are written in scalatest. Acceptance tests are located in `org.jmetrics.acceptance`, and should only
ever use `org.jmetrics.api` classes.

Unit and integration tests should be placed in the corresponding package name that they are testing.

# Coding style

- 120 line limit.
- 4 space indent.
- Align multiline parameters.
