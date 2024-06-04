import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //A=65 Z=90 a=97
        Scanner sc= new Scanner(System.in);
        String word = sc.nextLine();
        word = word.toUpperCase();
        int[] counting = new int[26];
        int max  = 0;
        for(char a : word.toCharArray()){
            counting[a-65]++;
            if(max < counting[a-65])
                max = counting[a-65];
        }

        int maxIdx = -1;
        for(int i =0;i<26;i++){
            if(counting[i] == max){
                if(maxIdx != -1){
                    maxIdx = -1;
                    break;
                }
                maxIdx = i;
            }
        }

        if(maxIdx == -1){
            System.out.println("?");
        }
        else{
            System.out.println((char)(maxIdx+65));
        }

    }
}
