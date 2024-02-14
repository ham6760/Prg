package Ex;

//배열 자르기

import java.util.Arrays;

public class Prg18 {
    
    public static void main(String[] args) {
        int[] numbers = {1,3,5};
        int num1 = 1, num2 = 2;
        System.out.println(Arrays.toString(solution1(numbers, num1, num2)));
    }
    
    public static int[] solution1(int[] numbers, int num1, int num2) {
        int[] answer = {};
        answer = Arrays.copyOfRange(numbers, num1, num2+1);
        return answer;
    }

    public static int[] solution2(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for (int i = num1; i <= num2; i++) {
            answer[i -num1] = numbers[i];
        }

        return answer;
    }

}