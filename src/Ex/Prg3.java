package Ex;

//피자 나눠 먹기 (1)

public class Prg3 {
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(solution2(n));
    }
    
    public static int solution1(int n) {
        int answer = n/7;
        int val = n%7 != 0 ? answer + 1 : answer;
        return val;
    }
    
    public static int solution2(int n) {
        return (n + 6) / 7;
    }

}
