// P039: 配列と検索値を受け取り、配列内に検索値が何回出現するかカウントする。  

import java.util.Arrays;
import java.util.Scanner;

public class P039_CountOccurrence {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 7, 2, 4, 4, 2};
        // 検索値の入力
        Scanner scanner = new Scanner(System.in);
        System.out.print("検索値として数値を入力してください > ");
        int search = Integer.parseInt(scanner.nextLine());
        // 配列内検索
        int count = countOccurrence(numbers, search);
        // 結果表示
        System.out.println(search + "は配列内に" + count + "個ありました。");
        System.out.println("検索した配列: " + Arrays.toString(numbers));
        scanner.close();
    }

    public static int countOccurrence(int[] numbers, int search) {
        int count = 0;
        // 配列を全探索
        for (int number : numbers) {
            // 検索値と一致したら、カウントアップ
            if (number == search) {
                count++;
            }
        }
        return count;
    }
}