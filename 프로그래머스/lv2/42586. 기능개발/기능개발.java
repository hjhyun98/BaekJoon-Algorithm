import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] days = new int[progresses.length];
        int[] temp = new int[progresses.length];
        for(int i = 0;i<progresses.length;i++){
            days[i] = (int) Math.ceil((double)(100-progresses[i])/speeds[i]);
        }
        
        int idx=0; 
        int cnt = 0;
        int bigger=days[0];
        for(int i = 0 ; i<progresses.length; i++){
            if(days[i] <= bigger){
                cnt++;
            }
            else{
                temp[idx] = cnt;
                bigger = days[i];
                cnt = 1;
                idx++;
            }
        }
        temp[idx] = cnt;
        
        int[] answer = new int[idx+1];
        for(int i = 0;i<=idx;i++){
            answer[i] = temp[i];
        }
        return answer;
    }
}