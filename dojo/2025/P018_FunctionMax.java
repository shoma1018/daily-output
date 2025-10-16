// P018: 2つの整数のうち大きい方を返すメソッドを実装する

import java.util.Scanner;

public class P018_FunctionMax {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("整数を入力してください > ");
    int num1 = Integer.parseInt(scanner.nextLine());
    System.out.print("整数を入力してください > ");
    int num2 = Integer.parseInt(scanner.nextLine());
    int result = compareInteger(num1, num2);
    System.out.println(result);
  }

  public static int compareInteger(int num1, int num2) {
    int max = num1 > num2 ? num1 : num2;
    return max;
  }
}