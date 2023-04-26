import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        System.out.println(photo.length);
        int[] answer = new int[photo.length];
        int idx = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i<name.length;i++){
            map.put(name[i], yearning[i]);
        }
        System.out.println(map);
        for(int i=0;i<photo.length;i++){
            int sum = 0;
            for(String str:photo[i]){
                if (map.containsKey(str)){
                    sum += map.get(str);    
                }
            }
            answer[idx] = sum;
            idx++;
        }
        return answer;
    }
}