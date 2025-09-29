// P001: 1~10までの数字を順に表示する

public class P001_PrintNumbers {
  public static void main(String[] args) {
    System.out.println("=== for loop ===");
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }

    System.out.println("=== while loop ===");
    int number1 = 1;
    while (number1 <= 10) {
      System.out.println(number1);
      number1++;
    }

    System.out.println("=== do-while loop ===");
    int number2 = 1;
    do {
      System.out.println(number2);
      number2++;
    } while (number2 <= 10);
  }
}