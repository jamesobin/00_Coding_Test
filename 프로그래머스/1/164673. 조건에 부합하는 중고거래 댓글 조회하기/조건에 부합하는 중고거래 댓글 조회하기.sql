-- 코드를 입력하세요
SELECT 
    USED_GOODS_BOARD.TITLE
    , USED_GOODS_BOARD.BOARD_ID
    , USED_GOODS_REPLY.REPLY_ID
    , USED_GOODS_REPLY.WRITER_ID	
    , USED_GOODS_REPLY.CONTENTS
    , DATE_FORMAT(USED_GOODS_REPLY.CREATED_DATE, '%Y-%m-%d')
FROM `USED_GOODS_BOARD`
JOIN `USED_GOODS_REPLY`
ON USED_GOODS_BOARD.BOARD_ID = USED_GOODS_REPLY.BOARD_ID
WHERE YEAR(USED_GOODS_BOARD.CREATED_DATE) = 2022 AND MONTH(USED_GOODS_BOARD.CREATED_DATE) = 10
ORDER BY USED_GOODS_REPLY.CREATED_DATE, USED_GOODS_BOARD.TITLE;