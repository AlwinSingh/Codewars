package Java;

import java.util.HashMap;

public class countWordsHashMap {
    public static void main(String[] args) {
        countWordsUsingHashMap("This this is is done by Saket Saket");
    }

    public static void countWordsUsingHashMap(String sentence) {
        String[] words = sentence.split(" ");
        HashMap<String, Integer> wordsmap = new HashMap<String, Integer>();

        for (int i = 0; i <= words.length-1; i++) {

            if (wordsmap.containsKey(words[i])) {
                int count = wordsmap.get(words[i]);
                //System.out.println("Count: " +count);;
                wordsmap.put(words[i], count+1);
            }
            else {
            wordsmap.put(words[i], 1);
            }
        }

        System.out.println(wordsmap);

    }
}