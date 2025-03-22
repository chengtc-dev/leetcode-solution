/* Write your PL/SQL query statement below */
SELECT name
  FROM Employee
 WHERE id in (
    SELECT managerId
      FROM Employee
     WHERE managerId IS NOT NULL
     GROUP BY managerId
    HAVING COUNT(managerId) >= 5
 );