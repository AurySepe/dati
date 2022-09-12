package com.github.benmanes.caffeine.cache.simulator.report;

import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Metrics extends Metrics {

  private final Function<Object, String> objectFormatter;

  private final DoubleFunction<String> percentFormatter;

  private final DoubleFunction<String> doubleFormatter;

  private final LongFunction<String> longFormatter;

  AutoValue_Metrics(
      Function<Object, String> objectFormatter,
      DoubleFunction<String> percentFormatter,
      DoubleFunction<String> doubleFormatter,
      LongFunction<String> longFormatter) {
    if (objectFormatter == null) {
      throw new NullPointerException("Null objectFormatter");
    }
    this.objectFormatter = objectFormatter;
    if (percentFormatter == null) {
      throw new NullPointerException("Null percentFormatter");
    }
    this.percentFormatter = percentFormatter;
    if (doubleFormatter == null) {
      throw new NullPointerException("Null doubleFormatter");
    }
    this.doubleFormatter = doubleFormatter;
    if (longFormatter == null) {
      throw new NullPointerException("Null longFormatter");
    }
    this.longFormatter = longFormatter;
  }

  @Override
  public Function<Object, String> objectFormatter() {
    return objectFormatter;
  }

  @Override
  public DoubleFunction<String> percentFormatter() {
    return percentFormatter;
  }

  @Override
  public DoubleFunction<String> doubleFormatter() {
    return doubleFormatter;
  }

  @Override
  public LongFunction<String> longFormatter() {
    return longFormatter;
  }

  @Override
  public String toString() {
    return "Metrics{"
        + "objectFormatter=" + objectFormatter + ", "
        + "percentFormatter=" + percentFormatter + ", "
        + "doubleFormatter=" + doubleFormatter + ", "
        + "longFormatter=" + longFormatter
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Metrics) {
      Metrics that = (Metrics) o;
      return this.objectFormatter.equals(that.objectFormatter())
          && this.percentFormatter.equals(that.percentFormatter())
          && this.doubleFormatter.equals(that.doubleFormatter())
          && this.longFormatter.equals(that.longFormatter());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= objectFormatter.hashCode();
    h$ *= 1000003;
    h$ ^= percentFormatter.hashCode();
    h$ *= 1000003;
    h$ ^= doubleFormatter.hashCode();
    h$ *= 1000003;
    h$ ^= longFormatter.hashCode();
    return h$;
  }

}
