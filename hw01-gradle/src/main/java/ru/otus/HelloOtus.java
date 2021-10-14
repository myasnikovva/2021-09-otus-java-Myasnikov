package ru.otus;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.List;


public class HelloOtus {
    public static void main(String... args) {
        List<Integer> example = ImmutableList.of(1, 2, 3);
        System.out.println(Lists.reverse(example));
    }
}
