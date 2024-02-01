package Ex;

//옷가게 할인 받기

public class Prg7 {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int price = 100010;
        System.out.println(solution1(price));
    }
    
    public static int solution1(int price) {
        int answer = 0;
        if(price >= 500000) {
            answer = (int) (price * 0.8);
        }
        else if (price >= 300000 ) {
            answer = (int) (price * 0.9);
        }
        else if (price >= 100000 ) {
            answer = (int) (price * 0.95);
        }
        else {
            answer = (int) price;
        }
        return answer;
    }
    
}
