package Ex;

import java.util.Arrays;

//아이스 아메리카노

public class Prg8 {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int money = 6000;
        System.out.println(Arrays.toString(solution2(money)));
    }
    
    public static int[] solution1(int money) {
        int[] answer = new int[2];
        int ame = 5500;
        int n = money / ame;
        int c = money - (ame * n);
        answer[0] = n;
        answer[1] = c;
        
        return answer;
    }
    
    public static int[] solution2(int money) {
        return new int[] { money / 5500, money % 5500 };
    }
    
}
