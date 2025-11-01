// P035: 整数配列を受け取り、要素を新しい配列にコピーする  

import java.util.Arrays;

public class P035_ArrayCopy {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    int[] newArray = copyArray(numbers);
    System.out.println("コピー元配列: " + Arrays.toString(numbers));
    System.out.println("コピー先配列: " + Arrays.toString(newArray));
  }
  
  public static int[] copyArray(int[] numbers) {
    int[] newArray = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      newArray[i] = numbers[i];
    }
    return newArray;
  }
}