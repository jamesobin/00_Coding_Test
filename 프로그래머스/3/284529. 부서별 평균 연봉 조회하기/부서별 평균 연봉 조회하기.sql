-- 코드를 작성해주세요

SELECT
    DP.DEPT_ID	
    , DP.DEPT_NAME_EN	
    , ROUND(AVG(EMP.SAL),0) AS `AVG_SAL`
FROM `HR_DEPARTMENT` AS `DP`
JOIN `HR_EMPLOYEES` AS `EMP`
ON DP.DEPT_ID = EMP.DEPT_ID
GROUP BY DP.DEPT_ID
ORDER BY `AVG_SAL` DESC;
