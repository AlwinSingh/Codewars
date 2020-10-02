package Java;

import java.util.*;


public class pangramChecker {
    public static void main(String[] args) {
        pangramChecker pc = new pangramChecker();
        pc.advancedChecker();
    }


    public void advancedChecker() {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        System.out.println(sentence.chars());
        System.out.println(sentence.chars().map(Character::toLowerCase));
       // System.out.println(sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic));
       // System.out.println(sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct());
       // System.out.println(sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count();
    }

    public boolean ThePangramChecker() { //Shittiest method with no error checks & proof checks
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String newsentence = "";
        sentence = sentence.toLowerCase().replaceAll("[^a-z]", "");
        
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') {
                newsentence = newsentence + sentence.charAt(i);
                //String letter = Character.toString(sentence.charAt(i));
                //sentence = sentence.replaceAll(letter, ".");
                //System.out.println("Replace: " +sentence);
            }
        }

        return newsentence.length() >= 26 ? true : false;
    }

    public boolean ThePangramHashChecker() {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll("[^a-z]", "");

        char[] chars = sentence.toCharArray();

        Set<Character> set = new HashSet<Character>();

        for( int i = 0; i < chars.length; i++ ) 
        set.add(chars[i]);

        //System.out.println(set.size());
        //System.out.println(set.size() == 26 ? "pangram" : "not pangram");
        return set.size() == 26 ? true : false;
    }

}