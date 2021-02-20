package com.yash.yashwant.first;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java 6", "Java 7", "Java 8");
        boolean flag = list.stream().allMatch(str ->{
            return str.contains("a");
        });
        System.out.println(flag);

        Consumer


    }
}
