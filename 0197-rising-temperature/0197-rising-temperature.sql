/* Write your PL/SQL query statement below */
SELECT w1.id AS id
  FROM Weather w1
 INNER JOIN Weather w2 ON w1.recordDate - w2.recordDate = 1
 WHERE w1.temperature > w2.temperature;