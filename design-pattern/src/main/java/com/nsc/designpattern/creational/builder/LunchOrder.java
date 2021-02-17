package com.nsc.designpattern.creational.builder;

/**
 * when many constructor parameters are exist and we need to make object immutable after constructing, then we should
 * use Builder design pattern
 * Advantages: If we want to check for null values before constructing object, then this pattern is helpful
 * Eg: StringBuilder, DocumentBuilder, Locale.Builder
 */
public class LunchOrder {
    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    public static Builder builder() {
        return new Builder();
    }

    private LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    @Override
    public String toString() {
        return "LunchOrder{" +
                "bread='" + bread + '\'' +
                ", condiments='" + condiments + '\'' +
                ", dressing='" + dressing + '\'' +
                ", meat='" + meat + '\'' +
                '}';
    }

    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }
    }
}
