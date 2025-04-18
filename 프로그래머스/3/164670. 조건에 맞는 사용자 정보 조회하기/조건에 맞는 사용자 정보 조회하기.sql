-- 코드를 입력하세요
SELECT DISTINCT
    USER.USER_ID,
    USER.NICKNAME,
    CONCAT(USER.CITY,' ', USER.STREET_ADDRESS1,' ', USER.STREET_ADDRESS2) AS `전체주소`,
    CONCAT(SUBSTRING(USER.TLNO,1,3), '-',
           SUBSTRING(USER.TLNO,4,4), '-',
           SUBSTRING(USER.TLNO,8,4)) AS `전화번호`
FROM`USED_GOODS_BOARD` AS `BOARD` 
JOIN `USED_GOODS_USER` AS `USER` 
ON BOARD.WRITER_ID = USER.USER_ID
WHERE
    BOARD.WRITER_ID IN (
        SELECT `WRITER_ID`
        FROM `USED_GOODS_BOARD`
        GROUP BY `WRITER_ID`
        HAVING COUNT(`BOARD_ID`) >= 3)
ORDER BY BOARD.WRITER_ID DESC;