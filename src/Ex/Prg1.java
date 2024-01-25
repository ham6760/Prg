package Ex;

import java.util.*;


// 최빈값 구하기

public class Prg1 {
    
    public static void main(String[] args) {
        int[] array = {1,2,2,1,2,1,3,2,4,4};
        int n = 15;
        System.out.println(solution1(array));
    }
    
    public static int solution1(int[] array) {
        int maxCount = 0;
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        // getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
        // getPrDefault(Object key, V DefaultValue)
        // 매개변수 : 이 메서드는 두개의 매개변수를 허용
        // key : 값을 가져와야 하는 요소의 키
        // defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값
        // 반환값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환

        for(int number : array) {
            int count = map.getOrDefault(number, 0) + 1;

            if(count > maxCount) {
                maxCount = count;
                answer = number;
            }

            else if(count == maxCount) {
                answer = -1;
            }

            map.put(number, count);
        }

        return answer;
    }
    
    public static int solution2(int[] array) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((o1, o2) -> o2.getValue() - o1.getValue());

        if (entries.size() > 1) {
            if (entries.get(0).getValue() == entries.get(1).getValue()) return -1;
        }

        return entries.get(0).getKey();
    }

}
