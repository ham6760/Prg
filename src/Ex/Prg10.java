package Ex;

//문자열 뒤집기

public class Prg10 {
    
    public static void main(String[] args) {
        String my_string = "jaron";
        System.out.println(solution1(my_string));
    }
    
    public static String solution1(String my_string) {
        StringBuffer sb = new StringBuffer(my_string);
        String answer = sb.reverse().toString();
        
        return answer;
    }
    
}
