// P002: 配列[1, 2, 3, 4, 5]を合計する

public class P002_ArraySum {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};

    System.out.println("=== for loop ===");
    int sum1 = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum1 += numbers[i];
    }
    System.out.println(sum1);

    System.out.println("=== enhanced for loop ===");
    int sum2 = 0;
    for (int number : numbers) {
      sum2 += number;
    }
    System.out.println(sum2);

    System.out.println("=== method calculateSum ===");
    int sum3 = calculateSum(numbers);
    System.out.println(sum3);

  }

  public static int calculateSum(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }
}