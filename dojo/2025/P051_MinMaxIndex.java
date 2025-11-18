// P051: 配列の最小値と最大値のインデックスを取得する。  

import java.util.Arrays;

public class P051_MinMaxIndex {
    public static void main(String[] args) {
        int[] numbers = {6, 2, 9, 3, 1, 4, 7, 5};
        int maxIndex = searchMax(numbers);
        int minIndex = searchMin(numbers);
        System.out.println("配列: " + Arrays.toString(numbers));
        System.out.println("最大値のインデックス: " + maxIndex);
        System.out.println("最小値のインデックス: " + minIndex);
    }

    public static int searchMax(int[] numbers) {
        int max = numbers[0];
        int index = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                index = i;
            }
        }

        return index;
    }

    public static int searchMin(int[] numbers) {
        int min = numbers[0];
        int index = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
                index = i;
            }
        }

        return index;
    }
}