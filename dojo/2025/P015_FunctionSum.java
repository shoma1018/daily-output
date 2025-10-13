// P015: 2つの整数を受け取り、合計を返すメソッドを作成する

import java.util.Scanner;

public class P015_FunctionSum {
  public static void main(String[] args) {
    //計算する値を受け付ける。
    Scanner scanner = new Scanner(System.in);
    System.out.print("1つ目の値を入力してください > ");
    int num1 = Integer.parseInt(scanner.nextLine());
    System.out.print("2つ目の値を入力してください > ");
    int num2 = Integer.parseInt(scanner.nextLine());
    //入力値を合計する。
    int sum = add(num1, num2);
    System.out.println(sum);
    scanner.close();
  }

  public static int add(int num1, int num2) {
    return num1 + num2;
  }
}