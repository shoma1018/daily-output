// P040: 配列内にある偶数の合計を計算する。  

import java.util.Arrays;

public class P040_SumEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 5, 6, 4, 9, 7, 8, 10};
        int sum = sumEvenNumbers(numbers);
        System.out.println("対象配列: " + Arrays.toString(numbers));
        System.out.println("偶数の合計は" + sum + "です。");
    }

    public static int sumEvenNumbers(int[] numbers) {
        int sum = 0;
        // 配列を全探索
        for (int number : numbers) {
            // 偶数かどうかチェック
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}