package Java;

public class camelCase {
    public static void main(String[] args) {
        toCamelCase(" camel case word");
    }

    public static String toCamelCase(String str) {
        String[] strarr = str.split(" ");

        for (int i = 0; i < strarr.length; i++) {
            if (strarr[i].length() > 0) {
            String letter = Character.toString(strarr[i].charAt(0));
            strarr[i] = strarr[i].replaceFirst(letter, letter.toUpperCase());
            }
        }

        return String.join("", strarr);

    }
}