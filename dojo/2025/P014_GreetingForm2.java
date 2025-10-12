// P014: ユーザ名を入力すると、「こんにちは、〇〇さん」と表示する

import java.util.Scanner;

public class P014_GreetingForm2 {
  public static void main(String[] args) {
    System.out.print("名前を入力してください > ");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    System.out.println("こんにちは、" + name + "さん");
    scanner.close();
  }
}