


# '경제' 카테고리에 속하는 도서들
# ID(BOOK_ID), 저자명(AUTHOR_NAME), 출판일(PUBLISHED_DATE) 리스트를 출력
# 결과는 출판일을 기준으로 오름차순 정렬
select b.BOOK_ID, a.AUTHOR_NAME, date_format(b.PUBLISHED_DATE,'%Y-%m-%d')
from AUTHOR a join BOOK b on a.AUTHOR_ID = b.AUTHOR_ID
where b.CATEGORY = '경제'
order by b.PUBLISHED_DATE asc;