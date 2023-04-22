import java.util.*;
class Solution {
    int[][] keypad = {{1,2,3}, {4,5,6}, {7,8,9},{11,0,12}};
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int l=11;
        int r=12;
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i] % 3 == 1 && numbers[i] != 0){
                answer += "L";
                l = numbers[i];
            }    
            else if(numbers[i] % 3 == 0 && numbers[i] != 0){
                answer += "R";
                r = numbers[i];
            }
            else{
                int[] l_loc = get_loc(l);
                int[] r_loc = get_loc(r);
                int[] n_loc = get_loc(numbers[i]);
                int l_dis = get_dis(l_loc, n_loc);
                int r_dis = get_dis(r_loc, n_loc);
                if(l_dis > r_dis){
                    answer += "R";
                    r = numbers[i];
                }
                else if(l_dis < r_dis){
                    answer += "L";
                    l = numbers[i];
                }
                else{
                    if(hand.equals("left")){
                        answer += "L";
                        l = numbers[i]; 
                    }else{
                        answer += "R";
                        r = numbers[i];
                    }
                }
            }
        }
        
        return answer;
    }
    
    public int[] get_loc(int num){
        int i=0; 
        int j=0;
        int[] temp = new int[2];
        for(i =0;i<4;i++){
            for(j = 0;j<3;j++){
                if(keypad[i][j] == num){
                    temp[0] = j;
                    temp[1] = i;
                }
            }
        }
        return temp;
    }
    
    public int get_dis(int[] lr_loc, int[] n_loc){
        return Math.abs(lr_loc[0]-n_loc[0])+Math.abs(lr_loc[1]-n_loc[1]);
    }
}