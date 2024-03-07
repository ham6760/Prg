package Ex;

//순서쌍의 개수

import java.util.stream.IntStream;

public class Prg21 {
    
    public static void main(String[] args) {
        int n = 100;
        System.out.println(solution2(n));
    }
    
    public static int solution1(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0) {
                answer++;
            }
        }
        return answer;
    }

    public static int solution2(int n) {
        return (int) IntStream.rangeClosed(1,n).filter(i -> n % i == 0).count();
    }
}