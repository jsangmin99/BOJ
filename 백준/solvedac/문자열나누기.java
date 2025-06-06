package solvedac;

public class 문자열나누기 {
    public static void main(String[] args) {
        String s = "banana";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int answer = 0;
        char x = s.charAt(0);
        int xCount = 1;
        int otherCount = 0;

        for (int i = 1; i < s.length(); i++) {

            if (x == ' ') {
                x = s.charAt(i);
                continue;
            }

            if (x == s.charAt(i))
                xCount++;
            else otherCount++;

            if (xCount == otherCount) {
                x = ' ';
                answer++;
                otherCount = 0;
                xCount = 1;
            }
        }

        if (x != ' ') answer++;

        return answer;
    }
}
