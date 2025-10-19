// P022: 入力された文字列の長さを表示する  

import java.util.Scanner;

public class P022_StringLength {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("文字列を入力してください > ");
    String value = scanner.nextLine();
    if (value.isEmpty()) {
      System.out.println("文字列の入力がありません。");
    } else {
      System.out.println("文字列の長さは" + value.length() + "文字です。");
    }
    scanner.close();
  }
}