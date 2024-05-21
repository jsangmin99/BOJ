-- 코드를 입력하세요
# '통풍시트', '열선시트', '가죽시트' 중 하나 이상의 옵션이 포함된
# 자동차 종류 별로
# 몇 대인지 출력하는 SQL문
# 자동차 수에 대한 컬럼명은 CARS
# 결과는 자동차 종류를 기준으로 오름차순 정렬

SELECT DISTINCT CAR_TYPE,
       (SELECT COUNT(*)
        FROM CAR_RENTAL_COMPANY_CAR AS C2
        WHERE C2.CAR_TYPE = C1.CAR_TYPE
          AND (C2.OPTIONS LIKE '%통풍시트%' OR 
               C2.OPTIONS LIKE '%열선시트%' OR 
               C2.OPTIONS LIKE '%가죽시트%')) AS CARS
FROM CAR_RENTAL_COMPANY_CAR AS C1
ORDER BY CAR_TYPE ASC;
