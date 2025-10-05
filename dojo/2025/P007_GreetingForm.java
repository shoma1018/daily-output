// P007: ユーザ名を入力すると、「ようこそ〇〇さん」と表示する

import java.util.Scanner;

public class P007_GreetingForm {
  public static void main(String[] args) {
    System.out.print("名前を入力してください > ");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    System.out.println("ようこそ" + name + "さん");
    scanner.close();
  }
}