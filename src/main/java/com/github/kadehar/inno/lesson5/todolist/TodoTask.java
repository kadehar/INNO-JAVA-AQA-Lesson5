package com.github.kadehar.inno.lesson5.todolist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class TodoTask {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>() {{
            add("Сделать уборку");
            add("Позавтракать");
            add("Сделать зарядку");
            add("Сделать д/з");
            add("Пообедать");
        }};
        IntStream.range(0, tasks.size()).forEach(index -> System.out.printf("Задача %d: %s\n", index + 1, tasks.get(index)));
    }
}