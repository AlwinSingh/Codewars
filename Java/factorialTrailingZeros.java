package Java;

public class factorialTrailingZeros {
    public static void main(String[] args) {
        countTrailingZeros(1000);
    }

    public static int countTrailingZeros(int number) {
        int count = 0;
      
        while (number >= 5) {
         number = number/5;
         count += number;
        }
        
        return count;
    }
}