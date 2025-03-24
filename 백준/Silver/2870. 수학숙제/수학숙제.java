import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<BigInteger> numberList = new ArrayList<>();

        for(int i = 0; i< n; i++){
            String s = br.readLine();
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < s.length(); j++){
                char c = s.charAt(j);
                if(Character.isDigit(c)){
                    sb.append(c);
                }else{
                    if (sb.length() > 0) {
                        numberList.add(new BigInteger(sb.toString()));
                        sb.setLength(0);
                    }
                }
            }
            if (sb.length() > 0) {
                numberList.add(new BigInteger(sb.toString()));
            }
        }

        numberList.sort(Comparator.naturalOrder());
        for(int i = 0; i < numberList.size(); i++){
            System.out.println(numberList.get(i));
        }
    }
}
