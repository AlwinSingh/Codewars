package Java;

public class arrRepeatedElements {
    public static void main(String args[]) {
      int[] arr = {1, 2, 3, 3, 5, 5};
      int count = 0;
      int element = 0;
     // ArrayList<Integer> nums = new ArrayList<Integer>();
      for (int i = 0; i < arr.length; i++) {
          int tempcount = 0;
          for (int j = 0; j < arr.length; j++) {
              if (i != j) {
              if (arr[i] == arr[j]) {
                  //nums.add(arr[i]);
                  //System.out.println(arr[i]);
                  tempcount++;
              }
              if (tempcount > count) {
                  element = arr[i];
                  count = tempcount;
              }
              }
          }
      }
      System.out.println(element);
    }
}