-- 코드를 작성해주세요

SELECT
    INFO.ITEM_ID	
    , INFO.ITEM_NAME	
    , INFO.RARITY
FROM `ITEM_INFO` AS `INFO`
LEFT JOIN `ITEM_TREE` AS `TREE`
ON TREE.PARENT_ITEM_ID = INFO.ITEM_ID
WHERE TREE.ITEM_ID IS NULL
ORDER BY INFO.ITEM_ID DESC;