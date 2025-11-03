// P036: 整数配列を受け取り、要素を逆順にした新しい配列を作成する  

import java.util.Arrays;
public class P036_ArrayReverse {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] reversedNumbers = reverseArray(numbers);
        System.out.println("逆順前: " + Arrays.toString(numbers));
        System.out.println("逆順後: " + Arrays.toString(reversedNumbers));
    }

    public static int[] reverseArray(int[] numbers) {
        int[] newArray = new int[numbers.length];
        int i = 0;
        int j = numbers.length - 1;
        while (j >= 0) {
            newArray[i] = numbers[j];
            i++;
            j--;
        }
        return newArray;
    }
}