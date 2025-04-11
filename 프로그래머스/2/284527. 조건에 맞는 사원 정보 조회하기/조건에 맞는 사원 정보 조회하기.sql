-- 코드를 작성해주세요

SELECT
    (SUM(HR_GRADE.SCORE)) AS `SCORE`
    , HR_EMPLOYEES.EMP_NO	
    , HR_EMPLOYEES.EMP_NAME	
    , HR_EMPLOYEES.POSITION	
    , HR_EMPLOYEES.EMAIL
FROM `HR_EMPLOYEES`
JOIN `HR_GRADE`
ON HR_EMPLOYEES.EMP_NO = HR_GRADE.EMP_NO
WHERE HR_GRADE.YEAR = 2022
GROUP BY HR_EMPLOYEES.EMP_NO
ORDER BY `SCORE` DESC
LIMIT 0, 1;