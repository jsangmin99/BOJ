package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class 카드뽑기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 각 날짜마다 카드에 대해 검사
        for (int t = 0; t < N; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Card> cards = new ArrayList<>();

            // 4개의 카드를 읽어옴
            while (st.hasMoreTokens()) {
                String card = st.nextToken();
                int number = card.charAt(0) - '0'; // 카드의 숫자 부분
                char alpha = card.charAt(1); // 카드의 알파벳 부분
                cards.add(new Card(number, alpha));
            }

            // 세 가지 조건 검사
            if (checkConsecutive(cards) || checkIdentical(cards) || checkPairs(cards)) {
                System.out.println(":)");
            } else {
                System.out.println(":(");
            }
        }

    }

    // 적힌 알파벳이 같으면서 숫자가 연속되는 세 장
    private static boolean checkConsecutive(List<Card> cards) {
        Map<Character, Set<Integer>> map = new HashMap<>();

        // 알파벳별로 숫자들을 Set으로 묶기 (중복된 숫자 자동 제거)
        for (Card c : cards) {
            map.putIfAbsent(c.getAlpha(), new HashSet<>());
            map.get(c.getAlpha()).add(c.getNumber());
        }

        // 연속된 숫자 확인
        for (Set<Integer> numbers : map.values()) {
            List<Integer> sortedNumbers = new ArrayList<>(numbers);
            Collections.sort(sortedNumbers);

            // 연속된 숫자 3개가 있는지 확인
            for (int i = 0; i < sortedNumbers.size() - 2; i++) {
                if (sortedNumbers.get(i) + 1 == sortedNumbers.get(i + 1)
                        && sortedNumbers.get(i + 1) + 1 == sortedNumbers.get(i + 2)) {
                    return true;
                }
            }
        }
        return false;
    }

    // 숫자와 알파벳이 모두 동일한 카드가 3개있는지
    private static boolean checkIdentical(List<Card> cards) {
        Map<String, Integer> countMap = new HashMap<>();

        // 카드들을 "숫자 + 알파벳" 으로 묶어서 개수를 셈
        for (Card card : cards) {
            String key = card.getNumber() + "" + card.getAlpha();
            countMap.put(key, countMap.getOrDefault(key, 0) + 1);
        }

        // 동일한 카드가 3개 이상 있으면 조건 만족
        for (int count : countMap.values()) {
            if (count >= 3) {
                return true;
            }
        }
        return false;
    }

    // 두장을 짝지었을때 깢이된 카드끼리 숫자와 알파벳이 동일한지 확인하는 함수
    private static boolean checkPairs(List<Card> cards) {
        Map<String, Integer> countMap = new HashMap<>();

        // 카드들을 "숫자+알파벳"으로 묶어서 개수를 셈
        for (Card card : cards) {
            String key = card.getNumber() + "" + card.getAlpha();
            countMap.put(key, countMap.getOrDefault(key, 0) + 1);
        }

        // 각 카드는 짝을 이루어야 하므로, 짝을 이루는 카드들이 2개 이상 존재해야 함
        for (int count : countMap.values()) {
            if (count % 2 != 0) {
                return false; // 짝이 맞지 않으면 조건을 만족하지 않음
            }
        }

        return true;
    }

    static class Card {
        private int cardNumber;
        private char cardAlpha;

        public Card(int cardNumber, char cardAlpha) {
            this.cardNumber = cardNumber;
            this.cardAlpha = cardAlpha;
        }

        public int getNumber() {
            return cardNumber;
        }

        public char getAlpha() {
            return cardAlpha;
        }

    }

}
