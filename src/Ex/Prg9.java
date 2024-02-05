package Ex;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//배열 뒤집기

public class Prg9 {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int money = 6000;
        System.out.println(Arrays.toString(solution2(array)));
    }

    public static List<Integer> solution1(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        Collections.reverse(list);

        return list;
    }
    
    public static int[] solution2(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        
        Collections.reverse(list);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
}
