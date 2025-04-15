-- 코드를 작성해주세요

SELECT
    G.EMP_NO
    , E.EMP_NAME
    , CASE
        WHEN AVG(`SCORE`) >= 96 THEN 'S'
        WHEN AVG(`SCORE`) >= 90 THEN 'A'
        WHEN AVG(`SCORE`) >= 80 THEN 'B'
        ELSE 'C'
    END AS `GRADE`
    , CASE
        WHEN AVG(`SCORE`) >= 96 THEN (E.SAL * 0.2)
        WHEN AVG(`SCORE`) >= 90 THEN (E.SAL * 0.15)
        WHEN AVG(`SCORE`) >= 80 THEN (E.SAL * 0.1)
        ELSE 0
    END AS `BONUS`
FROM `HR_GRADE` AS `G`
JOIN `HR_EMPLOYEES` `E`
ON G.EMP_NO = E.EMP_NO
GROUP BY G.EMP_NO
ORDER BY G.EMP_NO;
