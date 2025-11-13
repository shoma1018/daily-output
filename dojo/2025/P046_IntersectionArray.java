// P046: 2つの配列に共通して含まれる要素を見つけて、新しい配列として返す。  

import java.util.Arrays;

public class P046_IntersectionArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 6, 8, 9};
        int[] array2 = {1, 3, 4, 5, 6, 10};
        int[] array3 = createIntersectionArray(array1, array2);
        System.out.println("配列1" + Arrays.toString(array1));
        System.out.println("配列2" + Arrays.toString(array2));
        System.out.println("共通要素" + Arrays.toString(array3));
    }

    public static int[] createIntersectionArray(int[] array1, int[] array2) {
        // 一時的な配列
        int[] temp = new int[Math.min(array1.length, array2.length)];
        int index = 0;

        // 共通要素を探して追加
        for (int i = 0; i < array1.length; i++) {
            // array2にarray1[i]が含まれるかどうか
            boolean isArray2 = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    isArray2 = true;
                    break;
                }
            }

            // array2に含まれていて、かつ結果配列にまだ追加されていない場合
            if (isArray2 && !contains(temp, index, array1[i])) {
                temp[index] = array1[i];
                index++;
            }
        }

        return Arrays.copyOf(temp, index);
    }

    // 配列の指定範囲内に値が含まれているかチェック
    public static boolean contains(int[] array, int length, int value) {
        for (int i = 0; i < length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}