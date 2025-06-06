package solvedac;

import java.util.*;
import java.io.*;

public class 전투의신 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long money = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long tankerPower = Long.parseLong(st.nextToken());
        long tankerPrice = Long.parseLong(st.nextToken());
        long dealerPower = Long.parseLong(st.nextToken());
        long dealerPrice = Long.parseLong(st.nextToken());

        long maxPower = -1;
        long bestX = 0;
        long bestY = 0;

        for (long y = 0; y <= money / dealerPrice; y++){
            long totalDealerCost = y * dealerPrice;
            long remainMoney = money - totalDealerCost;

            long x = remainMoney / tankerPrice;
            long power = x * tankerPower + y * dealerPower;

            if(power  > maxPower){
                bestX = x;
                bestY = y;
                maxPower = power;
            }
        }

        System.out.println(bestX + " " + bestY);
    }
}
