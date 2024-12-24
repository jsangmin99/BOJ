package solvedac;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class dday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 오늘의 날짜 입력
        int startYear = scanner.nextInt();
        int startMonth = scanner.nextInt();
        int startDay = scanner.nextInt();
        
        // D-Day 날짜 입력
        int endYear = scanner.nextInt();
        int endMonth = scanner.nextInt();
        int endDay = scanner.nextInt();
        
        // LocalDate 객체 생성
        LocalDate today = LocalDate.of(startYear, startMonth, startDay);
        LocalDate dDay = LocalDate.of(endYear, endMonth, endDay);
        
        // 천년 이상 지속 여부 체크
        if (today.plusYears(1000).isBefore(dDay) || today.plusYears(1000).isEqual(dDay)) {
            System.out.println("gg");
        } else {
            // 남은 일 계산
            long daysBetween = ChronoUnit.DAYS.between(today, dDay);
            System.out.println("D-" + daysBetween);
        }
        
        scanner.close();
    }
}
