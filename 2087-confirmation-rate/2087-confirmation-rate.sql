/* Write your PL/SQL query statement below */
SELECT A.user_id, 
       ROUND(
        AVG(
         CASE WHEN B.action = 'confirmed' THEN 1 ELSE 0 END
        ), 2
       ) AS confirmation_rate
  FROM Signups A
  LEFT JOIN Confirmations B ON A.user_id = B.user_id
 GROUP BY A.user_id;