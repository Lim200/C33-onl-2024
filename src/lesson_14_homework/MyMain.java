package lesson_14_homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        String longestWord = getFile();
        writeFile(longestWord);
    }

    public static String getFile() {

        List<String> content = new ArrayList<String>();
        try {
            Scanner scanner = new Scanner(new File("src/lesson_14_homework/romeo_and_juliet.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\s+");
                Collections.addAll(content, words);
            }
            Collections.sort(content);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e.fillInStackTrace());
        }
        //System.out.println(content);
        return content.getFirst();
    }


    public static void writeFile(String word){
        try (FileWriter writer = new FileWriter("src/lesson_14_homework/longest_word.txt")) {
            writer.write(word);
            System.out.println("The longest word has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.fillInStackTrace());
        }
    }


}
