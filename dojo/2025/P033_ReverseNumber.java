//// P032: 入力された整数を逆順で表示する 

import java.util.Scanner;

public class P033_ReverseNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("整数を入力してください > ");
    int number = Integer.parseInt(scanner.nextLine());
    int reversedNumber = 0;
    while(number != 0) {
      int digit = number % 10;
      reversedNumber = reversedNumber * 10 + digit;
      number = number / 10;
    }
    System.out.println("逆順にした整数は" + reversedNumber);
    scanner.close();
  }
}