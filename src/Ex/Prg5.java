package Ex;

//피자 나눠 먹기 (3)

public class Prg5 {
    
    public static void main(String[] args) {
        int n = 5;
        int slice = 6;
        System.out.println(solution2(slice, n));
    }
    
    public static int solution1(int slice, int n) {
        int answer = n/slice;
        int val = n%slice != 0 ? answer + 1 : answer;
        return val;
    }
    
    public static int solution2(int slice, int n) {
        return (n + (slice -1)) / slice;
    }

}
