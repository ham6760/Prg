package Ex;

//진료순서 정하기

import java.util.Arrays;

public class Prg20 {
    
    public static void main(String[] args) {
        int[] emergency = {3,76,24};
        System.out.println(Arrays.toString(solution1(emergency)));
    }
    
    public static int[] solution1(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < answer.length; j++) {
                if(emergency[i] < emergency[j]) {
                    answer[i]++;
                }
            }
            answer[i]++;
        }
        return answer;
    }
}