/* Write your PL/SQL query statement below */
SELECT A.contest_id, 
       ROUND(
         COUNT(A.user_id) * 100 / (
           SELECT COUNT(*)
             FROM Users
         )
         , 2
       ) AS percentage
  FROM Register A
 GROUP BY A.contest_id
 ORDER BY percentage DESC, A.contest_id;