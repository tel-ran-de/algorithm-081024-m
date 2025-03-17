package org.telran.lecture_06_quick.hw;

// "Анаграммы"
// Задается массив строк - слов. Найти в нем все анаграммы (слова, составленные из одних и тех же букв).
import java.util.*;

public class task04 {
    public static void main(String[] args) {
        String[] words = {"listen", "silent", "enlist", "rat", "tar", "art", "evil", "vile", "live", "veil", "stone", "tones", "notes", "sky"};
        System.out.println("findAnagrams(words) = " + findAllAnagrams(words));

    }
//    [[rat, tar, art], ["evil", "vile", "live"], [], []]
//    rat -> art
//    tar -> art
//    art -> art
//    [[rat, art], [tar, art], [art, art]]
    public static Map<String, List<String>> findAllAnagrams(String[] words) {
        Map<String, List<String>> allWords = new HashMap<>();
        for (String word : words) {
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            allWords.putIfAbsent(new String(letters), new ArrayList<>());
            allWords.get(new String(letters)).add(word);

        }

        Map<String, List<String>> allAnagrams = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : allWords.entrySet()) {
            if (entry.getValue().size() > 1){
                allAnagrams.put(entry.getKey(),entry.getValue());
            }
        }
        return allAnagrams;
    }
}

//