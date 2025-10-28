// P031: 入力された数が素数かどうか判定する(今回はエラトステネスの篩は利用しない) 

import java.util.Scanner;

public class P031_PrimeCheck {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("数値を入力してください > ");
    int number = Integer.parseInt(scanner.nextLine());
    boolean result = isPrime(number);
    if (result) {
      System.out.println(number + "は素数です。");
    } else {
      System.out.println(number + "は素数ではありません。");
    }
    scanner.close();
  }

  public static boolean isPrime(int number) {
    // 1以下の数は素数ではない
    if (number <= 1) {
      return false;
    }

    // 2からnumber-1までの整数で割り切れるか調べる
    // 1とnumber以外で割り切れたら素数ではない
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}