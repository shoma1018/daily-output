// P032: 入力された整数の各桁の合計を求める 

import java.util.Scanner;

public class P032_SumOfDigits {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("整数を入力してください > ");
    int number = Integer.parseInt(scanner.nextLine());
    int sum = 0;
    while (number != 0) {
      int digit = number % 10;
      sum += digit;
      number /= 10;
    }
    System.out.println("各桁の合計は" + sum);
    scanner.close();
  }
}