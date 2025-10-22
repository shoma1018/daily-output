// P024: 特定の文字列がいくつ含まれるかを数える  

import java.util.Scanner;
public class P024_StringCountChar {
  public static void main(String[] args) {
    //検索対象と検索語の入力
    Scanner scanner = new Scanner(System.in);
    System.out.print("文字列を入力してください > ");
    String word = scanner.nextLine();
    System.out.print("検索語(文字)を入力してください > ");
    char searchChar = scanner.next().charAt(0);

    //検索語が検索対象に何個含まれるかカウント
    int count = 0;
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == searchChar) {
        count++;
      }
    }

    //結果を表示
    System.out.println("検索語(文字)は文字列に" + count + "個含まれています。");

    scanner.close();
  }
}