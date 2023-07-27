class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        int cntZero = 0;
        int cntMatch = 0;
        for(int i =0; i < 6; i++){
            if(lottos[i] == 0){
                cntZero++;
            }
            else{
                for(int j = 0; j<6;j++){
                    if(lottos[i] == win_nums[j]){
                        cntMatch++;
                    }
                }
            }
        }
        
        if(7 - (cntZero + cntMatch) < 6){
            answer[0] = 7 - (cntZero + cntMatch);    
        }else{
            answer[0] = 6;
        }
        
        
        if(7 - cntMatch < 6){
            answer[1] = 7 - cntMatch;
        }else{
            answer[1] = 6;
        }
        
        return answer;
    }
}