SELECT COUNT(USER_ID)
FROM USER_INFO
WHERE YEAR(JOINED) = 2021
AND AGE LIKE '2%'