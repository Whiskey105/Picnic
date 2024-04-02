import Controller.Operation;
import java.io.File;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        File source = new File("input.txt");
        if (!source.exists()){
            System.out.println("Файл input.txt отсутвует.");
            return;
        }
        //Получения количесва слов файле
        int wordCount = Operation.countWords(source);
        System.out.println("Количество слов в файле -> " + wordCount);


        //Создание списка слов с частотой их появления
        HashMap<String, Integer> wordMap = Operation.mapFill(source);
        //Получение самого длинного слова
        String longestWord = Operation.getLongestWord(wordMap);
        System.out.println("Самое длинное слово -> " + longestWord + " (" + longestWord.length() +" симв.)");
        //Вывод списка слов
        System.out.println("Частота появления слов:");
        wordMap.forEach((word, freq) -> System.out.println(word + " -> " + freq));


    }


}
