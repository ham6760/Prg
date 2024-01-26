package Ex;

//피자 나눠 먹기 (2)

public class Prg4 {
    
    public static void main(String[] args) {
        int n = 8;
        System.out.println(solution2(n));
    }
    
    public static int solution1(int n) {
        int answer = gcd(n, 6);
        int lcm = n*6/answer;
        
        return lcm/6 == 0 ? 1 : lcm/6;
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    public static int solution2(int n) {
        int answer = 1;

        while(true){
            if(6*answer%n==0) break;
            answer++;
        }

        return answer;
    }

}
