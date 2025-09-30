// P003: 配列[1, 2, 3, 4, 5]の最大・最小を探索する

public class P003_ArrayMaxMin {
  public static void main(String[] args) {

    int[] numbers = {1, 2, 3, 4, 5};

    int max = findMaxValue(numbers);
    int min = findMinValue(numbers);

    System.out.println("最大: " + max);
    System.out.println("最小: " + min);
  }

  public static int findMaxValue(int[] numbers) {
    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (max < numbers[i]) {
        max = numbers[i];
      }
    }
    return max;
  }

  public static int findMinValue(int[] numbers) {
    int min = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (min > numbers[i]) {
        min = numbers[i];
      }
    }
    return min;
  }
}