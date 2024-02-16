package Ex;

//외계행성의 나이

import java.util.Arrays;

public class Prg19 {
    
    public static void main(String[] args) {
        int age = 23;
        System.out.println(solution2(age));
    }
    
    public static String solution1(int age) {
        String answer = "";
        String val = Integer.toString(age);
        for (int i =0; i<val.length();i++) {
            answer+=(char)(val.charAt(i)+49);
        }
        return answer;
    }

    public static String solution2(int age) {
        String answer = "";
        String[] alpha = new String[]{"a","b","c","d","e","f","g","h","i","j"};

        while(age>0){
            answer = alpha[age % 10] + answer;
            age /= 10;
        }

        return answer;
    }
}