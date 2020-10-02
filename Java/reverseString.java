package Java;

public class reverseString {
    public static void main(String[] args) {
        reverseStringBuilder("Automation");
        reverseStringArray("Automation");
    }

    public static void reverseStringBuilder(String original) {
        StringBuilder reverse = new StringBuilder();

        reverse = reverse.append(original).reverse();
        System.out.println(reverse);
    }

    public static void reverseStringArray(String original) {
        String[] letters = original.split("");
        String reverseword = "";

        for (int i = original.length()-1; i >= 0; i--) {
            reverseword += letters[i];
        }

        System.out.println(reverseword);
    }
}