// P037: 整数配列から2番目に大きい数を見つける  

public class P037_SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 7, 9, 5};
        int result = findSecondLargest(numbers);
        System.out.println("2番目に大きい数は" + result + "です。");
    }

    public static int findSecondLargest(int[] numbers) {
        int max = Math.max(numbers[0], numbers[1]);
        int secondLargest = Math.min(numbers[0], numbers[1]);
        for (int i = 2; i < numbers.length; i++) {
            if (max < numbers[i]) {
                secondLargest = max;
                max = numbers[i];
            } else if (secondLargest < numbers[i]) {
                secondLargest = numbers[i];
            }
        }
        return secondLargest;
    }
}