import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {};

//         1. 탈락 - Set 을 써서 같은 단어를 말하는지 확인
//         2. 탈락 - 단어의 마지막 글자 저장 이후 말할때 마지막 즐자와 일치하는지 확인
//         3. 성공 - 문제가 없으면 0,0 출력
//         
        HashSet<String> usedWords = new HashSet<>();
        usedWords.add(words[0]);
        char lastChar = words[0].charAt(words[0].length()-1);

        for(int i = 1; i < words.length; i++){
            String nowWord = words[i];
//             실패
            if(usedWords.contains(nowWord) || nowWord.charAt(0) != lastChar ){
                int person = (i % n) + 1; // 몇 번째 사람인지
                int turn = (i / n) + 1;   // 해당 사람의 몇 번째 차례인지
                return new int[]{person, turn};
            }
            
            usedWords.add(nowWord); //단어추가
            lastChar = nowWord.charAt(nowWord.length() - 1); //마지막 글자 업데이트
        
        }
        
//         성공시 0,0
        return new int[]{0, 0};
    }
}