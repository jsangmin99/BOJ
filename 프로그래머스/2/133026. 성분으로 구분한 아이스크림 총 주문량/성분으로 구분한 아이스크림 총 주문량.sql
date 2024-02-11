-- 코드를 입력하세요
SELECT I.INGREDIENT_TYPE, SUM(F.TOTAL_ORDER) AS TOTAL_ORDER
FROM FIRST_HALF F
    JOIN ICECREAM_INFO I ON F.FLAVOR = I.FLAVOR
GROUP BY I.INGREDIENT_TYPE

# 상반기 동안 각 아이스크림 성분 타입과 성분 타입에 대한 아이스크림의 총주문량을
# 총주문량이 작은 순서대로 조회하는 SQL 문
# 총주문량을 나타내는 컬럼명은 TOTAL_ORDER