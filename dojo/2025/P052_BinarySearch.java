// P052: ソート済み配列に対して、二分探索を行い、対象のインデックスを取得する。  

import java.util.Arrays;

public class P052_BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 7, 8, 9, 11, 15};
        int search = 4;
        int index = search(numbers, search);
        System.out.println("配列: " + Arrays.toString(numbers));
        System.out.println("検索対象: " + search);
        if (index != -1) {
            System.out.println("インデックス: " + index);
        } else {
            System.out.println("検索値が見つかりませんでした。");
        }
    }

    public static int search(int[] numbers, int search) {

        int left = 0;  // 探索範囲の左端
        int right = numbers.length - 1;  // 探索範囲の右端

        while (left <= right) {

            int middle = (left + right) / 2;  // 中央

            if (numbers[middle] == search) {
                return middle;
            } else if (numbers[middle] < search) {
                left = middle + 1;   // 探索範囲を右に絞り込む
            } else if (numbers[middle] > search) {
                right = middle - 1;  // 探索範囲を左に絞り込む
            }
        }

        return -1;
    }
}