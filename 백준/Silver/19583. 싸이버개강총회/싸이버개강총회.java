import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 첫 번째 줄 입력 (S, E, Q)
        st = new StringTokenizer(br.readLine());
        String S = st.nextToken();
        String E = st.nextToken();
        String Q = st.nextToken();

        // 채팅 기록
        String input;
        Set<String> checkIn = new HashSet<>(); // 입장 확인된 학회원
        Set<String> checkOut = new HashSet<>(); // 퇴장 확인된 학회원

        while ((input = br.readLine()) != null && !input.isEmpty()) {
            st = new StringTokenizer(input);
            String time = st.nextToken();
            String nickname = st.nextToken();

            if (time.compareTo(S) <= 0) { // 개강총회 시작 전(포함)
                checkIn.add(nickname);
            } else if (time.compareTo(E) >= 0 && time.compareTo(Q) <= 0) { // 개강총회 끝 이후~스트리밍 종료까지
                checkOut.add(nickname);
            }
        }

        // 입장과 퇴장이 모두 확인된 학회원
        checkIn.retainAll(checkOut); // 교집합 계산
        System.out.println(checkIn.size());
    }
}
