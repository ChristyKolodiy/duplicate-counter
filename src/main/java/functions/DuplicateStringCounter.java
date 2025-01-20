package functions;

import java.util.*;

public class DuplicateStringCounter {
    private static final String[] WORDS = {
            "apple", "banana", "cherry", "date", "grape", "kiwi",
            "mango", "orange", "pear", "pineapple", "strawberry", "watermelon"
    };

    public static void main(String[] args) {
        List<String> words = generateListOfWords(100);
        System.out.println("Words generated: " + words);

        Map<String, Integer> duplicateCounts = getDuplicatesCount(words);
        System.out.println("Duplicate Counts: " + duplicateCounts);
    }

    private static List<String> generateListOfWords(int size) {
        List<String> words = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            words.add(WORDS[rand.nextInt(WORDS.length)]);
        }
        return words;
    }

    private static Map<String, Integer> getDuplicatesCount(List<String> stringList) {
        Map<String, Integer> results = new HashMap<>();
        for (String s : stringList) {
            results.merge(s, 1, Integer::sum);
        }
        return results;
    }
}
