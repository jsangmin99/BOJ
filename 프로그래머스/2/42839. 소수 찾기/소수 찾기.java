import java.util.*;
import java.io.*;
class Solution {
    static Set<Integer> combSet;
    static boolean[] visited = new boolean[7];
    
    public int solution(String numbers) {
        int answer = 0;
        combSet = new HashSet<Integer>();
//         1. 모든 조합을 만든다.
//         2. 조합이 소수인지 카운트 한다.
        
        dfs(numbers, 0, "");
        
        for(Integer i : combSet){
            if(isPrime(i)){
                answer++;
            }
        }   
        
        
        return answer;
    }
    static void dfs(String numbers, int depth, String s){
        if(depth > numbers.length()){
            return;
        }
        
        for(int i = 0; i < numbers.length(); i++){
            if(visited[i] == false){
                visited[i] = true;
                combSet.add(Integer.parseInt(s+numbers.charAt(i)));
                dfs(numbers, depth +1, s + numbers.charAt(i));
                visited[i] = false;
            }
        }
        
    }
    
    static boolean isPrime(int n){
        if(n == 0 || n == 1){
            return false;
        }
        
        for(int i = 2; i <= (int)Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}