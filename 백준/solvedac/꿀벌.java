package solvedac;

import java.io.*;
import java.util.*;

public class 꿀벌 {
    public static void main(String[] args) {
        String[] activities = {"Re","Pt","Cc","Ea","Tb","Cm","Ex"};
        Map<String,Integer> activityCount = new HashMap<>();
        for(String activity : activities){
            activityCount.put(activity, 0);
        }

        Scanner sc = new Scanner(System.in);
        String line;
        List<String> inputActivities = new ArrayList<>();
        while (sc.hasNext()) {
            String activity = sc.next();
            if(activityCount.containsKey(activity)){
                activityCount.put(activity, activityCount.get(activity)+1);
            }
            inputActivities.add(activity);
        }
        sc.close();

        int totalActivity = inputActivities.size();

        for (String activity : activities){
            int count = activityCount.get(activity);
            double ratio = (double) count / totalActivity;
            System.out.printf("%s %d %.2f\n", activity, count, ratio);
        }

    }
    
}
