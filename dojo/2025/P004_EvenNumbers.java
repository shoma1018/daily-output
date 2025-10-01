// P004: 1〜20の偶数を表示する

public class P004_EvenNumbers {
  public static void main(String[] args) {
    int n = 20;

    System.out.println("=== for + if version ===");
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    System.out.println("=== for (step by 2) version ===");
    for (int i = 2; i <= n; i += 2) {
      System.out.println(i);
    }
  }
}