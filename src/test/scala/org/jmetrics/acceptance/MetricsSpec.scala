package org.jmetrics.acceptance

import org.jmetrics.api.MetricFactory
import org.scalatest.{FeatureSpec, GivenWhenThen}

class MetricsSpec extends FeatureSpec with GivenWhenThen {

  feature("Counter") {
    scenario("Can increment counter and get its value") {

      Given("a new counter")
      val counter = MetricFactory.getCounter("Pricer.pricings")

      When("counter is incremented twice")
      counter.increment()
      counter.increment()

      Then("counter value should be 2")
      assert(counter.value() == 2)
    }

    scenario("Can reset the counter's value") {

      Given("a counter with non zero value")
      val counter = MetricFactory.getCounter("Pricer.pricings")
      counter.increment()
      counter.increment()
      counter.increment()

      When("counter is reset")
      counter.reset()

      Then("counter value should be 0")
      assert(counter.value() == 0)
    }
  }
}
