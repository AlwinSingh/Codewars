package Java;

import java.util.Arrays;

public class numberExpanded {
    public static void main(String[] args) {
        expandNumbrs(71024);
    }

    public static void expandNumbrs(int number) {
        String[] str = Integer.toString(number).split("");
        String result = "";

        for (int i = 0; i < str.length - 1; i++) {
            if (Integer.parseInt(str[i]) > 0) {
                for (int j = i; j < str.length - 1; j++) {
                    str[i] += '0';
                    System.out.println(str[i]);
                }
            }
        }

        result = Arrays.toString(str);
        // System.out.println(result.length());
        result = result.substring(1, result.length()-1).replace(", 0", "").replace(",", " +");
        System.out.println(result);
    }
}