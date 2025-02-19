package lesson_18_homework;

import java.util.*;
import java.util.stream.Collectors;

public class MyMain {
    public static void main(String[] args) {
        sumElements();
        selectValues();
    }

    public static void sumElements() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(22);
        arrayList.add(1);
        arrayList.add(22);
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(8);
        int result =
                arrayList.stream().distinct().filter(e -> e % 2 == 0)
                        .reduce(0, (acc, e) -> acc + e, Integer::sum);
        System.out.println("------- Task 1 -------");
        System.out.println("The sum of the remaining elements in the stream = " + result);
    }

    public static void selectValues(){
        Map<Integer, String> mapName = new HashMap<>();
        mapName.put(1,"Ivan");
        mapName.put(2,"Sergey");
        mapName.put(3,"Alexandr");
        mapName.put(4,"Dima");
        mapName.put(8,"Maria");
        mapName.put(13, "Feday");

        Set<Integer> id = Set.of(1, 2, 5, 8, 9, 13);

        List<String> result = mapName.entrySet().stream()
                .filter(e -> id.contains(e.getKey())) // Отбор по id
                .map(Map.Entry::getValue)
                .filter(name -> name.length() % 2 != 0) // Фильтр по нечетному количеству букв
                .map(name -> new StringBuilder(name).reverse().toString()) // Реверс имен
                .collect(Collectors.toList());

        System.out.println("------- Task 2 -------");
        System.out.println(result);
    }
}
