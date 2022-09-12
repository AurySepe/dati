package com.github.benmanes.caffeine.cache.simulator.policy;

import com.google.common.collect.ImmutableSet;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_PolicyStats_Metric extends PolicyStats.Metric {

  private final String name;

  private final Object value;

  private final PolicyStats.Metric.MetricType type;

  private final boolean required;

  private final ImmutableSet<Policy.Characteristic> characteristics;

  AutoValue_PolicyStats_Metric(
      String name,
      Object value,
      PolicyStats.Metric.MetricType type,
      boolean required,
      ImmutableSet<Policy.Characteristic> characteristics) {
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (value == null) {
      throw new NullPointerException("Null value");
    }
    this.value = value;
    if (type == null) {
      throw new NullPointerException("Null type");
    }
    this.type = type;
    this.required = required;
    if (characteristics == null) {
      throw new NullPointerException("Null characteristics");
    }
    this.characteristics = characteristics;
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public Object value() {
    return value;
  }

  @Override
  public PolicyStats.Metric.MetricType type() {
    return type;
  }

  @Override
  public boolean required() {
    return required;
  }

  @Override
  public ImmutableSet<Policy.Characteristic> characteristics() {
    return characteristics;
  }

  @Override
  public String toString() {
    return "Metric{"
        + "name=" + name + ", "
        + "value=" + value + ", "
        + "type=" + type + ", "
        + "required=" + required + ", "
        + "characteristics=" + characteristics
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PolicyStats.Metric) {
      PolicyStats.Metric that = (PolicyStats.Metric) o;
      return this.name.equals(that.name())
          && this.value.equals(that.value())
          && this.type.equals(that.type())
          && this.required == that.required()
          && this.characteristics.equals(that.characteristics());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= value.hashCode();
    h$ *= 1000003;
    h$ ^= type.hashCode();
    h$ *= 1000003;
    h$ ^= required ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= characteristics.hashCode();
    return h$;
  }

}
