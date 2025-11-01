// P034: 入力された数値の階乗を計算する 

import java.util.Scanner;

public class P034_Factorial {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("数値を入力してください > ");
    int number = Integer.parseInt(scanner.nextLine());
    long factorial = 1;
    for (int multiplier = number; multiplier > 0; multiplier--) {
      factorial *= multiplier;
    }
    System.out.println("入力した数値の階乗は" + factorial + "です。");
    scanner.close();
  }
}