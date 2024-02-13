-- 코드를 입력하세요
SELECT DISTINCT(C.CAR_ID)
FROM CAR_RENTAL_COMPANY_CAR AS C
    JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY AS H
    ON C.CAR_ID = H.CAR_ID
WHERE CAR_TYPE LIKE '세단' 
    AND MONTH(START_DATE) = 10
ORDER BY CAR_ID DESC


# 자동차 종류가 '세단'인 자동차들 중
# 10월에 대여를 시작한 기록이 있는
# 자동차 ID 리스트를 출력하는 SQL문을
# 자동차 ID 리스트는 중복이 없어야
# 자동차 ID를 기준으로 내림차순 정렬