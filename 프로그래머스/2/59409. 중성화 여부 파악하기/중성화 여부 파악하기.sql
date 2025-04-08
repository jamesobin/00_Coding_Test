-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, 
IF((INSTR(SEX_UPON_INTAKE, 'Neutered') > 0 or INSTR(SEX_UPON_INTAKE, 'Spayed') > 0), 'O', 'X') AS 중성화
FROM ANIMAL_INS;