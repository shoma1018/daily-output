// P011: 1〜20の奇数を表示する

public class P011_OddNumbers {
  public static void main(String[] args) {
    int n = 20;
    for (int i = 1; i <= n; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }
  }
}