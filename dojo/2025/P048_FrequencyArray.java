// P048: 配列内の各要素の出現回数を出力する。  
// ※数値以外の値やマイナス値を考慮していません。
import java.util.Arrays;

public class P048_FrequencyArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 3, 2, 1, 4};
        int[] frequencyNumbers = countFrequency(numbers);
        System.out.println("配列: " + Arrays.toString(numbers));
        for (int i = 0; i < frequencyNumbers.length; i++) {
            if (frequencyNumbers[i] > 0) {
                System.out.println("frequency[" + i + "] = " + frequencyNumbers[i]);
            }
        }
    }

    public static int[] countFrequency(int[] numbers) {

        // 配列から最大値を見つける
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        // 各要素の頻度を管理する配列を定義
        int[] frequency = new int[max + 1];

        // 各要素をカウント
        for (int number : numbers) {
            frequency[number]++;
        }

        return frequency;
    }
}