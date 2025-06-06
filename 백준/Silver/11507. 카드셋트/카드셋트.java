import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Set<String> cardSet = new HashSet<>();
        Map<Character, Integer> countMap = new HashMap<>();

        countMap.put('P', 0);
        countMap.put('K', 0);
        countMap.put('H', 0);
        countMap.put('T', 0);

        for (int i = 0; i < s.length(); i += 3) {
            String card = s.substring(i, i + 3);
            char image = card.charAt(0);

            if (cardSet.contains(card)) {
                System.out.println("GRESKA");
                return;
            }
            cardSet.add(card);
            countMap.put(image, countMap.get(image) + 1);
        }

        System.out.print((13 - countMap.get('P')) + " " +
                (13 - countMap.get('K')) + " " +
                (13 - countMap.get('H')) + " " +
                (13 - countMap.get('T')));
    }
}
