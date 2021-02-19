package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        String[] arr = {"аптека", "багаж","беседа", "восток","газета", "багаж","горох", "группа","девочка", "багаж",
                "аптека", "забота","аптека", "восток","завод", "девочка","инженер", "газета"};
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i]))
                hm.put(arr[i], hm.get(arr[i]) + 1);
            else
                hm.put(arr[i], 1);
        }
        System.out.println();
        System.out.println("Список слов: \n" + Arrays.toString(arr));
        System.out.println();
        System.out.println("Посчитаем, сколько раз встречается каждое слово");
        System.out.println(hm);
        System.out.println();

        Phonebook directory = new Phonebook();

        directory.add("Иванов", "+79375262423");
        directory.add("Петров", "+79375262424");
        directory.add("Сидоров", "+79375262425");
        directory.add("Петров", "+79375262426");
        directory.add("Федоров", "+79375262427");
        directory.add("Сидоров", "+79375262428");
        directory.add("Петров", "+79375262429");

        System.out.println(directory);
        System.out.println();
        System.out.println("Добавляем ещё один контакт Смирнов: +79375263242");
        directory.add("Смирнов", "+79375263242");
        System.out.println();
        System.out.println(directory);
        System.out.println();
        System.out.println("Добавляем ещё один телефон Федорову: +79375262444");
        directory.add("Федоров", "+79375262444");
        System.out.println("Федоров" + directory.get("Федоров"));
    }
}
