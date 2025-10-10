// P012: 配列[1, 2, 3, 4, 5]を逆順に表示する

public class P012_ReverseArray {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    int lastIndex = numbers.length - 1;
    for (int i = lastIndex; i >= 0; i--) {
      System.out.println(numbers[i]);
    }
  }
}