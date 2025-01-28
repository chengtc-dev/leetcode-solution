/* Write your PL/SQL query statement below */
select st.student_id, st.student_name, su.subject_name, 
       count(ex.subject_name) as attended_exams
  from Students st
  join Subjects su 
       on su.subject_name is not null
  left join Examinations ex 
       on st.student_id = ex.student_id 
       and su.subject_name = ex.subject_name
 group by st.student_id, st.student_name,
          su.subject_name, ex.subject_name
 order by st.student_id, su.subject_name;