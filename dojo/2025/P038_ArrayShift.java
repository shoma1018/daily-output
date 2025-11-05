// P038: 配列を右に1つシフトさせる。
// ※最後の要素は先頭に移動する。 
// ※In-placeの観点から実装する。

import java.util.Arrays;

public class P038_ArrayShift {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("シフト前: " + Arrays.toString(numbers));
        shiftArray(numbers);
        System.out.println("シフト後: " + Arrays.toString(numbers));
    }

    public static void shiftArray(int[] numbers) {
        //末尾のインデックスと要素を取得
        int lastIndex = numbers.length - 1;
        int lastValue = numbers[lastIndex];
        //後ろから順に右へずらす
        for (int i = lastIndex; i > 0; i--) {
            numbers[i] = numbers[i-1];
        }
        //保持しておいた末尾の要素を先頭に代入
        numbers[0] = lastValue;
    }
}