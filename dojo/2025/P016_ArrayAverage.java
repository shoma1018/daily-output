// P016: 配列 [5,10,15,20] の平均値を計算する

public class P016_ArrayAverage {
  public static void main(String[] args) {
    int[] numbers = {5, 10, 15, 20};
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    double average = sum / (double)numbers.length;

    System.out.println(average);
  }
}