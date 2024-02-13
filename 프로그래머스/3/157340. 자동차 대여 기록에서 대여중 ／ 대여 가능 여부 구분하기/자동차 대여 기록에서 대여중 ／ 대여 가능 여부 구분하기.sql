-- 코드를 입력하세요
SELECT CAR_ID,
    CASE WHEN CAR_ID IN (
        SELECT CAR_ID
        FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
        WHERE '2022-10-16' BETWEEN START_DATE AND END_DATE
        )
    THEN '대여중'
    ELSE '대여 가능'
    END AVAILABILITY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID
ORDER BY CAR_ID DESC

# 컬럼(컬럼명: AVAILABILITY)을 추가
# 2022년 10월 16일에 대여 중인 자동차인 경우 '대여중' 이라고 표시
# 대여 중이지 않은 자동차인 경우 '대여 가능'을 표시
    # 이때 반납 날짜가 2022년 10월 16일인 경우에도 '대여중
# 결과는 자동차 ID를 기준으로 내림차순 정렬
    