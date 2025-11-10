// P043: 配列から重複する要素を削除する。  
// ※ArrayListは利用せず、配列のみで実装する。  

import java.util.Arrays;

public class P043_RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 3, 4, 5, 5, 7, 8, 8, 8, 10};
        int[] uniqueNumbers = createUniqueArray(numbers);
        System.out.println("重複削除前" + Arrays.toString(numbers));
        System.out.println("重複削除後" + Arrays.toString(uniqueNumbers));
    }

    public static int[] createUniqueArray(int[] numbers) {
        // ユニークな要素をカウント
        int uniqueCount = 0;
        LABEL1:for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                } else if (numbers[i] == numbers[j]) {
                    continue LABEL1;
                } 
            }
            uniqueCount++;
        }

        // ユニークな要素とそのインデックスを格納する配列を準備
        int[] uniqueNumbers = new int[uniqueCount];

        // ユニークな要素のインデックスを保持
        int index = 0;
        LABEL2:for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                } else if (numbers[i] == numbers[j]) {
                    continue LABEL2;
                } 
            }
            uniqueNumbers[index] = numbers[i];
            index++;
        }

        return uniqueNumbers;
    }
}