package Ex;

//개미군단

import java.util.stream.IntStream;

public class Prg22 {
    
    public static void main(String[] args) {
        int hp = 999;
        System.out.println(solution1(hp));
    }
    
    public static int solution1(int hp) {
        int j = hp/5, b = (hp%5)/3, w = (hp%5)%3, answer = 0;
        answer = j+b+w;
        return answer;
    }

    public static int solution2(int hp) {
        return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
    }

}