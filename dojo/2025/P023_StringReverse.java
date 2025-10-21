// P023: 文字列を逆順にして、表示する  

import java.util.Scanner;

public class P023_StringReverse {
  public static void main(String[] args) {
    //文字列の入力を受け取る
    Scanner scanner = new Scanner(System.in);
    System.out.print("文字列を入力してください > ");
    String word = scanner.nextLine();

    //文字列を逆順にする
    StringBuilder reverseWord = new StringBuilder();
    for (int i = word.length() - 1; i >= 0; i--) {
      reverseWord.append(word.charAt(i));
    }

    //結果を表示する
    System.out.println("反転した文字列は「" + reverseWord + "」です。");
    scanner.close();
  }
}