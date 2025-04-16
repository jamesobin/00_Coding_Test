-- 코드를 작성해주세요

SELECT C.ID
FROM (
    SELECT `ID`, `PARENT_ID` 
    FROM `ECOLI_DATA` 
    WHERE `PARENT_ID` IS NULL
) AS `A`
JOIN `ECOLI_DATA` AS `B` ON A.ID = B.PARENT_ID 
JOIN `ECOLI_DATA` AS `C` ON B.ID = C.PARENT_ID
ORDER BY C.ID;