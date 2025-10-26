// P028: 名前と職業を入力すると、「こんにちは、○○さん（職業：△△）」と出力する  

import java.util.Scanner;

public class P028_UserGreeting {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("名前を入力してください > ");
    String name = scanner.nextLine();
    System.out.print("職業を入力してください > ");
    String job = scanner.nextLine();
    System.out.println("こんにちは、" + name + "さん（職業：" + job + "）");
    scanner.close();
  }
}