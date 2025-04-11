-- 코드를 작성해주세요

SELECT
    INFO.ID	
    , NAME.FISH_NAME	
    , INFO.LENGTH
FROM `FISH_INFO` AS `INFO`
JOIN `FISH_NAME_INFO` AS `NAME`
ON INFO.FISH_TYPE = NAME.FISH_TYPE
WHERE (INFO.FISH_TYPE, INFO.LENGTH) IN (
        SELECT 
            `FISH_TYPE`
            , MAX(`LENGTH`) AS `LENGTH`
        FROM `FISH_INFO`
        GROUP BY `FISH_TYPE`
    )
ORDER BY INFO.ID;