package Ex;

//양꼬치

public class Prg16 {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int money = 6000;
        String my_string = "BCBdbe";
        String letter = "B";
        int n = 64 , k = 6;
        System.out.println(solution2(n, k));
    }
    
    public static int solution1(int n, int k) {
        int answer = 0;
        int a = 12000, b= 2000, val = n/10;
        k = (val>=1) ? k-val : k;
        answer = (a*n) + (b*k);

        return answer;
    }
    public static int solution2(int n, int k) {
        return n * 12000 + k * 2000 - (n / 10 * 2000);
    }
}