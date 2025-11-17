// P050: 配列内で指定された値が出現するインデックスを全て取得する。  

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class P050_SearchMultiple {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 2, 5, 7, 9};
        int search = 2;
        List<Integer> results = searchIndex(numbers, search);
        System.out.println("配列: " + Arrays.toString(numbers));
        System.out.println("検索値: " + search);
        System.out.println("インデックス: " + results.toString());
    }

    public static ArrayList<Integer> searchIndex(int[] numbers, int search) {

        ArrayList<Integer> results = new ArrayList<>();

        // 指定された値のインデックスを取得
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                results.add(i);
            }
        }

        return results;
    }
}