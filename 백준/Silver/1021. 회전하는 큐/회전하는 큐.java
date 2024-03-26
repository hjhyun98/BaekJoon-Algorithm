import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static int cnt = 0;
    static LinkedList<Integer> deque = new LinkedList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 1; i <= n; i++){
            deque.add(i);
        }

        for(int i = 0; i < m ; i++){
            int num = sc.nextInt();

            if(checkPosition(num)){//참인경우 = 2번연산
                while(deque.get(0) != num){
                    deque.addLast(deque.pollFirst());
                    cnt++;
                }
            }
            else{//거짓일경우 = 3번연산
                while(deque.get(0) != num){
                    deque.addFirst(deque.pollLast());
                    cnt++;
                }
            }

            deque.remove();
        }

        System.out.println(cnt);
    }

    static boolean checkPosition(int num){
        for(int i = 0; i <= deque.size()/2;i++){
            if(num == deque.get(i)){
                return true;
            }
        }
        return false;
    }
}
