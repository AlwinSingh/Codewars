package Java;

public class camelCasePart2 {
    public static void main(String[] args) {
        toCamelCase("the_stealth_warrior");
    }

    public static String toCamelCase(String str) {
        if (str.length() < 1) {
            return "";
        }

        System.out.println(str);

        char first = str.charAt(0);

        if (first == '-' || first == '_') {
            str = str.replaceFirst(Character.toString(first), "");
        }

        String[] strarr;

        if (str.indexOf("-") == -1) {
         strarr = str.split("_");
        } else {
         strarr = str.split("-");
        }

        for (int i = 1; i < strarr.length; i++) {
            //System.out.println(strarr[i]);
            if (strarr[i].length() > 0) {
                String letter = Character.toString(strarr[i].charAt(0));
                strarr[i] = strarr[i].replaceFirst(letter, letter.toUpperCase());
            }
        }

        System.out.println(String.join("", strarr));
        return String.join("", strarr);

    }
}