package Ex;

//문자 반복 출력하기

public class Prg13 {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int money = 6000;
        String my_string = "hello";
        int n = 3;
        System.out.println(solution1(my_string,n));
    }
    
    public static String solution1(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
