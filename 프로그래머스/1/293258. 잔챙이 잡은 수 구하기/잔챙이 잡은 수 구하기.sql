-- 코드를 작성해주세요
# 단! 잡은 물고기의 길이가 10cm 이하일 경우에는 LENGTH 가 NULL 이며!
SELECT count(ID) as "FISH_COUNT"
FROM FISH_INFO
WHERE LENGTH IS NULL;