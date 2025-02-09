package lesson_16_homework;

import java.util.HashMap;
import java.util.Map;

public class MyMain {
    public static void main(String[] args) {
        outputMapTask1();
        outputMapTask2();
    }


    public static void outputMapTask1() {
        String[] str1 = {"a", "b", "a", "c", "b"};
        String[] str2 = {"c", "b", "a"};
        String[] str3 = {"c", "c", "c", "c"};

        System.out.println("------------ Task1 ------------");
        System.out.println(wordMultiple(str1));
        System.out.println(wordMultiple(str2));
        System.out.println(wordMultiple(str3));
    }

    public static Map<String, Boolean> wordMultiple(String[] strings){
        Map<String, Integer> map = new HashMap<>();
        Map<String, Boolean> resultMap = new HashMap<>();

        for(String str:strings){
            map.put(str,map.getOrDefault(str,0) +1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            resultMap.put(entry.getKey(), entry.getValue() >= 2);
        }
        return resultMap;
    }

    public static void outputMapTask2() {
        String[] str1 = {"code", "bug"};
        String[] str2 = {"man", "moon", "main"};
        String[] str3 = {"man", "moon", "good", "night"};

        System.out.println("------------ Task2 ------------");
        System.out.println(findePairs(str1));
        System.out.println(findePairs(str2));
        System.out.println(findePairs(str3));
    }

    public static Map<String, String> findePairs(String[] strings){
        Map<String, String> map = new HashMap<>();


        for(String str:strings){
            String firstChar = "" + str.charAt(0);
            String lastChar = "" + str.charAt(str.length() -1);
            map.put(firstChar,lastChar);
        }
        return map;
    }

}
