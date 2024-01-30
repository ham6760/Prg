package Ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//배열의 평균값

public class Prg6 {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 5;
        int slice = 6;
        System.out.println(solution1(array));
    }
    
    public static double solution1(int[] numbers) {
        double answer = 0;
        List<Integer> list = Arrays.stream(numbers)
                                   .boxed().collect(Collectors.toList());
        int sum = list.stream().reduce(0, (a, b) -> a+b);
        answer = (double)sum/numbers.length;
        
        return answer;
    }
    
    public static double solution2(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }

}
