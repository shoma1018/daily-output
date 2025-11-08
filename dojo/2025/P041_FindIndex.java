// P041: 検索値を受け取り、その値が最初に出現したインデックスを返す。  

import java.util.Arrays;
import java.util.Scanner;

public class P041_FindIndex {
    public static void main(String[] args) {
        // 検索対象の配列定義
        int[] numbers = {1, 2, 5, 10, 16, 20, 23, 31, 40, 52};
        // 検索値の入力
        Scanner scanner = new Scanner(System.in);
        System.out.print("検索値として数値を入力してください > ");
        int searchValue = Integer.parseInt(scanner.nextLine());
        // 検索
        int index = search(numbers, searchValue);
        // 結果の表示
        System.out.println("検索対象の配列: " + Arrays.toString(numbers));
        if (index == -1) {
            System.out.println("検索値が見つかりませんでした。");
        } else {
            System.out.println("検索値のインデックスは" + index + "です。");
        }
        scanner.close();
    }

    public static int search(int[] numbers, int searchValue) {
        // 全探索
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }
}
