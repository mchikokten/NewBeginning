package com.ua.robot.Lesson20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, String> hashMapList = new HashMap<>();

        hashMapList.put("Голова", "English: Head; German: Kopf; Japanese: 頭");
        hashMapList.put("Розетка", "English: Rosette; German: Rosette; Japanese: ロゼット");
        hashMapList.put("Кукурудза", "English: Corn; German: Mais; Japanese: トウモロコシ");
        hashMapList.put("Наречений", "English: Fiance; German: Verlobter; Japanese: 婚約者");
        hashMapList.put("Водойма", "English: Water; German: Wasser; Japanese: 水");
        hashMapList.put("Олігарх", "English: Oligarch; German: Oligarch; Japanese: オリガルヒ");
        hashMapList.put("Артист", "English: Artist; German: Künstler; Japanese: アーティスト");
        hashMapList.put("Трактор", "English: Tractor; German: Traktor; Japanese: トラクター");
        hashMapList.put("Льох", "English: Cellar; German: Keller; Japanese: セラー");
        hashMapList.put("Консерваторія", "English: Conservatory; German: Wintergarten; Japanese: コンサバトリー");

        System.out.println(hashMapList);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word: ");
        while (true) {
            String word = scanner.nextLine();
            if (word == null || word.isEmpty()) {
                break;
            }
            if (hashMapList.containsKey(word)) {
                System.out.println("Translations are: " + hashMapList.get(word));
            } else {
                System.out.println("The word is not found");
            }

        }
    }

}

