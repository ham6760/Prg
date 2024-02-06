package Ex;

import java.util.Arrays;
import java.util.stream.IntStream;

//짝수 홀수 개수

public class Prg12 {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int money = 6000;
        System.out.println(Arrays.toString(solution3(array)));
    }
    
    public static int[] solution1(int[] array) {
        int a = 0,b = 0;
        int[] answer = new int[2];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) a++;
            else b++;
        }
        answer[0] = a;
        answer[1] = b;
        return answer;
    }
    
    public static int[] solution2(int[] array) {
        return IntStream.of((int) Arrays.stream(array).filter(i -> i % 2 == 0).count(), (int) Arrays.stream(array).filter(i -> i % 2 == 1).count()).toArray();
    }
    
    public static int[] solution3(int[] array) {
        int[] answer = new int[2];

        for(int i = 0; i < array.length; i++)
            answer[array[i] % 2]++;

        return answer;
    }
    
}
