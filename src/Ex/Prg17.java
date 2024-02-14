package Ex;

//짝수의 합

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prg17 {
    
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution1(n));
    }
    
    public static int solution1(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            list.add(i);
        }
        list.stream()
            .filter(item -> item % 2 != 0)
            .collect(Collectors.toList())
            .forEach(re -> { list.remove(re); });
        int answer = list.stream().reduce(0,Integer::sum);
        return answer;
    }

    public static int solution2(int n) {
        int answer = 0;

        for(int i=2; i<=n; i+=2){
            answer+=i;
        }

        return answer;
    }
    public static int solution3(int n) {
        return IntStream.rangeClosed(0, n).filter(e -> e % 2 == 0).sum();
    }
}