// P047: 2つの配列の和集合を求め、新しい配列として返す。  

import java.util.Arrays;

public class P047_UnionArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        int[] array3= findUnion(array1, array2);
        System.out.println("配列1: " + Arrays.toString(array1));
        System.out.println("配列2: " + Arrays.toString(array2));
        System.out.println("和集合: " + Arrays.toString(array3));
    }

    public static int[] findUnion(int[] array1, int[] array2) {
        // 一時的な配列
        int[] temp = new int[array1.length + array2.length];

        // array1を追加
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            temp[index] = array1[i];
            index++;
        }

        // array2を追加(すでに追加されている値は追加しない)
        LABEL: for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < index; j++) {
                if (array2[i] == temp[j]) {
                    continue LABEL;
                }
            }
            temp[index] = array2[i];
            index++;
        }

        return Arrays.copyOf(temp, index);
    }
}