package Ex;

//각도기

public class Prg15 {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int money = 6000;
        String my_string = "BCBdbe";
        String letter = "B";
        int angle = 180;
        System.out.println(solution1(angle));
    }
    
    public static int solution1(int angle) {
        int answer = 0;

        if (0<angle && angle<90) {
            answer = 1;
        }
        else if (angle == 90) {
            answer = 2;
        }
        else if (90<angle && angle<180) {
            answer = 3;
        }
        else {
            answer = 4;
        }

        return answer;
    }
}
