package Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


// 짝수는 싫어요
public class Prg2 {
    
    public static void main(String[] args) {
        int[] array = {1,2,2,1,2,1,3,2,4,4};
        int n = 15;
        System.out.println(solution1(n));
    }

    public static List<Integer> solution1(int n) {
        int[] array = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= array.length; i++) {
            list.add(i);
        }
        list.stream()
            .filter(item -> item % 2 == 0)
            .collect(Collectors.toList())
            .forEach(re -> { list.remove(re); });
        
        return list;
    }
    
    public int[] solution2(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }

}
