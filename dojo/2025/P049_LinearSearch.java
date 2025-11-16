// P049: 配列内を先頭から順に探索して、探索値のインデックスを取得する。  
// ※線形探索の実装

import java.util.Arrays;

public class P049_LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 12, 3};
        // ケース1
        int search1 = 8;
        int index1 = searchIndex(numbers, search1);
        System.out.println("探索対象の配列: " + Arrays.toString(numbers));
        System.out.println("探索値: " + search1);
        if (index1 == -1) {
            System.out.println("探索対象はありませんでした。");
        } else {
            System.out.println("探索対象のインデックス: " + index1);
        }

        // ケース2
        int search2 = 100;
        int index2 = searchIndex(numbers, search2);
        System.out.println("探索対象の配列: " + Arrays.toString(numbers));
        System.out.println("探索値: " + search2);
        if (index2 == -1) {
            System.out.println("探索対象はありませんでした。");
        } else {
            System.out.println("探索対象のインデックス: " + index2);
        }
    }

    public static int searchIndex(int[] numbers, int search) {
        // 全探索
        for (int i = 0; i < numbers.length; i++) {
            // 探索対象かどうか
            if (numbers[i] == search) {
                return i;
            }
        }

        // 探索対象がない場合は-1を返す
        return -1;
    }
}