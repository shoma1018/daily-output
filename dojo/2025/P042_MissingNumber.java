// P042: 1〜10までの数値のうち、1つだけ欠けている配列から欠けた数値を見つける。  

import java.util.Arrays;

public class P042_MissingNumber {
    private static final int EXPECTED_SUM = 55;  // 1~10の合計
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int missingNumber = findMissingNumber(numbers);
        System.out.println("対象の配列: " + Arrays.toString(numbers));
        System.out.println("欠けた数値: " + missingNumber);
    }

    public static int findMissingNumber(int[] numbers) {
        // 受け取った配列の合計を計算
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        // 1~10の合計と配列の合計の差を返す
        return EXPECTED_SUM - sum;
    }
}