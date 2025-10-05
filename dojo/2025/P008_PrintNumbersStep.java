// P008: 1〜10までの数字を2ずつ増加で表示する

public class P008_PrintNumbersStep {
  public static void main(String[] args) {
    int start = 1;
    int end = 10;
    int step = 2;
    for (int i = start; i <= end; i += step) {
      System.out.println(i);
    }
  }
}