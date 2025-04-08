-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, 
IF((INSTR(SEX_UPON_INTAKE, 'Neutered') > 0 or INSTR(SEX_UPON_INTAKE, 'Spayed') > 0), 'O', 'X')
FROM ANIMAL_INS; 