// P017: 配列 [3, 6, 9, 12, 15, 18, 21, 24] に含まれる偶数の数をカウントする

public class P017_ArrayCountEven {
  public static void main(String[] args) {
    int[] numbers = {3, 6, 9, 12, 15, 18, 21, 24};
    int count = 0;
    for (int number : numbers) {
      if (number % 2 == 0) {
        count++;
      }
    }
    System.out.println(count);
  }
}