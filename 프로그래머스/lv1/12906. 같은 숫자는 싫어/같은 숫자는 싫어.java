import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int idx = 0;
        int temp = -1;
        for(int i = 0; i < arr.length; i++){
            if(temp != arr[i]){
                answer.add(arr[i]);
            }
            temp = arr[i];
        }

        int[] realanswer = new int[answer.size()];
        for(int i = 0 ; i < answer.size(); i++){
            realanswer[i] = answer.get(i).intValue();
        }
        
        return realanswer;
    }
}