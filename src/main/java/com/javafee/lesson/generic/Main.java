package com.javafee.lesson.generic;

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("a"); //0
        strings.add("b"); //1
        strings.add("c"); //2

        System.out.println(strings.get(0));
        System.out.println(strings.get(1));
        System.out.println(strings.get(2));
        System.out.println(strings.get(3));

        System.out.println(strings.get("a"));
        System.out.println(strings.get("b"));
        System.out.println(strings.get("c"));
        System.out.println(strings.get("d"));

        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        LinkedList<LocalDate> dates = new LinkedList<>();
        dates.add(LocalDate.of(2022, 1, 1));
        dates.add(LocalDate.of(2022, 2, 1));
        dates.add(LocalDate.of(2022, 3, 1));

        System.out.println(strings);
        System.out.println(integers);
        System.out.println(dates);
    }
}
