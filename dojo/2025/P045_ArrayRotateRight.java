// P045: 配列を右に2個分回転させる。  
// ※In-placeで実装する。

import java.util.Arrays;

public class P045_ArrayRotateRight {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("シフト前: " + Arrays.toString(numbers));
        rotateRight(numbers);
        System.out.println("シフト後: " + Arrays.toString(numbers));
    }

    public static void rotateRight(int[] numbers) {

        // 最後の2要素を保持
        int last = numbers[numbers.length - 1];
        int secondFromLast = numbers[numbers.length - 2];

        // 後ろから右に2つ移動
        for (int i = numbers.length - 1; i > 1; i--) {
            numbers[i] = numbers[i - 2];
        }

        // 保持していた要素を先頭に格納
        numbers[0] = secondFromLast;
        numbers[1] = last;
    }
}