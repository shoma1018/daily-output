// P044: 2つの配列を1つの配列に結合する。  

import java.util.Arrays;

public class P044_MergeArrays {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {4, 5};
        int[] mergedNumbers = mergeArrays(numbers1, numbers2);
        System.out.println("1つ目の配列: " + Arrays.toString(numbers1));
        System.out.println("2つ目の配列: " + Arrays.toString(numbers2));
        System.out.println("結合した配列: " + Arrays.toString(mergedNumbers));
    }

    public static int[] mergeArrays(int[] numbers1, int[] numbers2) {
        // 新しい配列の要素数を算出して、配列を定義
        int mergedSize = numbers1.length + numbers2.length;
        int[] newNumbers = new int[mergedSize];

        // 1つ目の配列の要素を追加する
        int index = 0;
        for (int i = 0; i < numbers1.length; i++) {
            newNumbers[index] = numbers1[i];
            index++;
        }

        // 2つ目の配列の要素を追加する  
        for (int i = 0; i < numbers2.length; i++) {
            newNumbers[index] = numbers2[i];
            index++;
        }

        return newNumbers;
    }
}