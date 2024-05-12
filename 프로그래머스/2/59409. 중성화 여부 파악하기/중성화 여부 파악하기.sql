SELECT ANIMAL_ID, NAME, 
CASE
    WHEN SEX_UPON_INTAKE like 'Neutered%'
        OR SEX_UPON_INTAKE like 'Spayed%' then 'O'
    else 'X'
    END
FROM ANIMAL_INS
