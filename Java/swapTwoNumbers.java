package Java;

public class swapTwoNumbers {
    public static void main(String[] args) {
        swapNumbers(3, 5);
        swapNumbersWithoutTemp(3, 5);
    }

    public static void swapNumbers(int x, int y) {
        int temp = 0;

        System.out.println("X: " +x);
        System.out.println("Y: " +y);

        temp = x;
        x = y;
        y = temp;
        
        System.out.println("-------------");
        System.out.println("X: " +x);
        System.out.println("Y: " +y);
    }

    public static void swapNumbersWithoutTemp(int x, int y) {
        System.out.println("X: " +x);
        System.out.println("Y: " +y);
        //Test case is  3 & 5
        x = x + y; //8 Largest Sum
        y = x - y; //3 //Largest - Variable = Other Variable ()
        x = x - y; //Larges - Known Variable = Other Variable ()
        System.out.println("-------------");
        System.out.println("X: " +x);
        System.out.println("Y: " +y);
    }
}