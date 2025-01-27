/* Write your PL/SQL query statement below */
SELECT a1.machine_id AS machine_id,
       ROUND(AVG(a2.timestamp - a1.timestamp), 3) AS processing_time
  FROM Activity a1
  JOIN Activity a2 
    ON a1.machine_id = a2.machine_id 
   AND a2.activity_type = 'end'
 WHERE a1.activity_type = 'start'
 GROUP BY a1.machine_id
 ORDER BY a1.machine_id;