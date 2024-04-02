package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Operation {
    public static HashMap<String, Integer> mapFill (File source){
        try {
            Scanner scanner = new Scanner(source);
            HashMap<String, Integer> foodFreq = new HashMap<String, Integer>();

            while (scanner.hasNext()){
                String word = scanner.next().toLowerCase();
                foodFreq.put(word, foodFreq.getOrDefault(word, 0) + 1);
            }


            return foodFreq;

        } catch (FileNotFoundException e){
            System.err.println("Файл input.txt отсутствует.");
            throw new RuntimeException(e);
        }
    }

    public static int countWords(File source) {
        int result = 0;
        try (Scanner scanner = new Scanner(source)) {
                while (scanner.hasNext()) {
                    scanner.next();
                    result += 1;
                }
            return result;
        } catch (FileNotFoundException e){
            System.err.println("Файл input.txt отсутствует.");
            throw new RuntimeException(e);
        }
    }

    public static String getLongestWord(HashMap<String, Integer> wordMap) {
        String result = "";
        for (String key : wordMap.keySet()) {
            if(key.length() > result.length()) {
                result = key;
            }
        }
        return result;
    }
}
