-- 코드를 입력하세요
SELECT CONCAT("/home/grep/src/",B.BOARD_ID,"/", F.FILE_ID, F.FILE_NAME, F.FILE_EXT) AS FILE_PATH
FROM USED_GOODS_BOARD B
    JOIN USED_GOODS_FILE F ON B.BOARD_ID = F.BOARD_ID
WHERE B.VIEWS = (
    SELECT MAX(ViEWS)
    FROM USED_GOODS_BOARD)
ORDER BY F.FILE_ID DESC

# 조회수가 가장 높은 중고거래 게시물에 대한 첨부파일 경로를 조회하는 SQL문
# 첨부파일 경로는 FILE ID를 기준으로 내림차순 정렬
# 기본적인 파일경로는 /home/grep/src/ 이며
# 게시글 ID를 기준으로 디렉토리가 구분되고
# 파일이름은 (파일 ID/파일 이름/파일 확장자)로 구성
# 조회수가 가장 높은 게시물은 하나만 존재