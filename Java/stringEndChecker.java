package Java;

public class stringEndChecker {
    public static void main(String[] args) {
        solution("abc", "abcd");
    }

    public static boolean solution(String str, String ending) {
        int length = ending.length();

        String letters = "";
        
        try {
        for (int i = str.length()-1; i >= (str.length() - length); i--) {
          letters = str.charAt(i) + letters;
          System.out.println(letters);
        }
    } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException exception) {
        return false;
    }
        
        return letters.equals(ending) ? true : false;
      }
}