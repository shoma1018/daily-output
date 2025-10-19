// P021: 四則演算を行う簡単な電卓(コンソール入力)  

import java.util.Arrays;
import java.util.Scanner;

public class P021_Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("01: + 02: - 03: * 04: /");
    System.out.print("番号を選択してください > ");
    String selection = scanner.nextLine();
    System.out.print("数値を半角スペース区切りで入力してください > ");
    String line = scanner.nextLine();
    double[] numbers = Arrays.stream(line.split(" ")).mapToDouble(Double::parseDouble).toArray();
    double result = 0;
    switch(selection) {
      case "01":
        result = add(numbers);
        break;
      case "02":
        result = subtract(numbers);
        break;
      case "03":
        result = multiply(numbers);
        break;
      case "04":
        result = divide(numbers);
        break;
      default:
        System.out.println("エラーが発生しました。");
        return;
    }
    System.out.println("計算結果: " + result);
  }

  public static double add(double[] numbers) {
    double result = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      result += numbers[i];
    }
    return result;
  }

  public static double subtract(double[] numbers) {
    double result = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      result -= numbers[i];
    }
    return result;
  }

  public static double multiply(double[] numbers) {
    double result = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      result *= numbers[i];
    }
    return result;
  }

  public static double divide(double[] numbers) {
    double result = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] == 0) {
        System.out.println("0で割ることはできません。");
        return result;
      }
      result /= numbers[i];
    }
    return result;
  }
}