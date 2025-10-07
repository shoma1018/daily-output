public class P010_ArrayMaxMin2 {
  public static void main(String[] args) {
    int[] numbers = {3, 7, 1, 9, 5};
    int max = findMaxValue(numbers);
    int min = findMinValue(numbers);
    System.out.println("最大値: " + max);
    System.out.println("最小値: " + min);
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