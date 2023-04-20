import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> idxMap = new HashMap<>();
        
        for (int i = 0; i< id_list.length;i++){
            String name = id_list[i];
            map.put(name, new HashSet<>());
            idxMap.put(name,i);
        }
        
        for(String str: report){
            String[] temp = str.split(" ");
            String report_user = temp[0];
            String reported_user = temp[1];
            map.get(reported_user).add(report_user);
        }
        
        for(int i = 0;i<id_list.length;i++){
            HashSet<String> send = map.get(id_list[i]);
            if(send.size() >= k){
                for(String name: send){
                    answer[idxMap.get(name)]++;
                }
            }
        }
        return answer;
    }
}