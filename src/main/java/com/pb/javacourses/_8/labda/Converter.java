package com.pb.javacourses._8.labda;

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}