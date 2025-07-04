-- 코드를 입력하세요

# 입양을 간 동물 중, 
# 보호 기간이 가장 길었던 동물 두 마리의 아이디와 이름을 조회
# 이때 결과는 보호 기간이 긴 순으로 조회해야 합니다.
SELECT 
    I.ANIMAL_ID,
    I.NAME
FROM ANIMAL_INS I JOIN ANIMAL_OUTS O ON I.ANIMAL_ID=O.ANIMAL_ID 
ORDER BY DATEDIFF(O.DATETIME, I.DATETIME) DESC
LIMIT 2;

