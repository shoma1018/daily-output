// P025: ２つの文字列を結合して、出力する  

import java.util.Scanner;

public class P025_StringConcat {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("1つ目の文字列を入力してください > ");
    String word1 = scanner.nextLine();
    System.out.print("2つ目の文字列を入力してください > ");
    String word2 = scanner.nextLine();
    System.out.println(word1 + word2);
    scanner.close();
  }
}