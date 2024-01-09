package com.example;

import java.util.Set;
import java.util.function.*;
import java.util.stream.Collector;

/**
 * Dummy class to demonstrate the implementation of a custom collector.
 */
public class MySuperCoolCollector implements Collector<String,StringBuilder,String> {

        @Override
        public Supplier<StringBuilder> supplier() {
            return StringBuilder::new;
        }

        @Override
        public BiConsumer<StringBuilder, String> accumulator() {
            return StringBuilder::append;
        }

        @Override
        public BinaryOperator<StringBuilder> combiner() {
            return StringBuilder::append;
        }

        @Override
        public Function<StringBuilder, String> finisher() {
            return StringBuilder::toString;
        }

        @Override
        public Set<Characteristics> characteristics() {
            return Set.of(Characteristics.CONCURRENT);
        }

        public static Collector<String,StringBuilder,String > combineStrings(){
            return new MySuperCoolCollector();
        }
}
