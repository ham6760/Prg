package Ex;

//특정 문자 제거하기

public class Prg14 {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int money = 6000;
        String my_string = "BCBdbe";
        String letter = "B";
        int n = 3;
        System.out.println(solution1(my_string,letter));
    }
    
    public static String solution1(String my_string, String letter) {
        String answer = "";
        answer = my_string.replaceAll(letter,"");

        return answer;
    }
}
