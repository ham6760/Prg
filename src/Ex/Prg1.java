package Ex;

import java.util.*;


// 최빈값 구하기

public class Prg1 {
    
    public static void main(String[] args) {
        int[] array = {1,2,2,1,2,1,3,2,4,4};
        int n = 15;
        System.out.println(solution2(array));
    }
    
    public static int solution1(int[] array) {
        int maxCount = 0;
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        // 프로그래머스 문제풀이에 남겨져 있는 주석 (감사합니다)
        // getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
        // getPrDefault(Object key, V DefaultValue)
        // 매개변수 : 이 메서드는 두개의 매개변수를 허용
        // key : 값을 가져와야 하는 요소의 키
        // defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값
        // 반환값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환

        for(int number : array) {
            int count = map.getOrDefault(number, 0) + 1; // 찾는 키가 존재하면 키의 값을, 없다면 1을 반환해줌

            if(count > maxCount) {
                maxCount = count; // maxCount에 count값을 집어넣어 반복문을 돌 때 count가 더 클경우에 answer에 number값을 집어넣음
                answer = number;
            }

            else if(count == maxCount) { // count와 maxCount가 같으면 -1을 answer에 -1을 담음
                answer = -1;
            }

            map.put(number, count);
        }

        return answer;
    }
    
    public static int solution2(int[] array) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1); // 찾는 키가 존재한다면 key=num, value
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet()); //entry를 사용하여 entries에 map값을 담아줌
        entries.sort((o1, o2) -> o2.getValue() - o1.getValue()); //람다식을 사용해 value값이 큰 순서대로 정렬

        if (entries.size() > 1) {
            if (entries.get(0).getValue() == entries.get(1).getValue()) return -1; // 제일큰값과 그 다음값이 같으면 -1을 반환
        }

        return entries.get(0).getKey();
    }

}
