-- 코드를 작성해주세요
select
    P.ID,
    P.GENOTYPE,
    S.GENOTYPE AS PARENT_GENOTYPE
from ECOLI_DATA P, ECOLI_DATA S
where P.PARENT_ID = S.ID
    AND S.GENOTYPE & P.GENOTYPE = S.GENOTYPE
ORDER BY ID
