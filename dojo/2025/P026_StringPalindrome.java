// P026: 入力が回文か判定する  

import java.util.Scanner;

public class P026_StringPalindrome {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("文字列を入力してください > ");
    String word = scanner.nextLine();
    boolean result = checkPalindrome(word);
    if (result) {
      System.out.println("「" + word + "」は回文です。");
    } else {
      System.out.println("「" + word + "」は回文ではありません。");
    }
  }

  public static boolean checkPalindrome(String word) {
    int left = 0;
    int right = word.length() - 1;
    while(left <= right) {
      if (word.charAt(left) != word.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
}