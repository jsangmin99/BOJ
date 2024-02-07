-- 코드를 입력하세요
SELECT HISTORY_ID, CAR_ID, 
    DATE_FORMAT (START_DATE,'%Y-%m-%d') AS CAR_ID, 
    DATE_FORMAT(END_DATE,'%Y-%m-%d') AS END_DATE, 
CASE WHEN DATEDIFF(END_DATE, START_DATE) < 29 
    then '단기 대여' 
    ELSE '장기 대여' 
    END AS  RENT_TYPE
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE START_DATE LIKE '2022-09-%'
ORDER BY HISTORY_ID DESC;

# 알아야 할것 = CASE WHEN
# case when은 slelct 절에서 사용한
# 1. 9월의 대여 기록 
# 2. 열을 집계하는 경우