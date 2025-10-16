// P019: 配列 [1,2,3,4,5] を合計する(P002_ArraySumの関数化バージョン)  

public class P019_ArraySumReview {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    int result = calculateSum(numbers);
    System.out.println("合計: " + result);
  }

  public static int calculateSum(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }
}