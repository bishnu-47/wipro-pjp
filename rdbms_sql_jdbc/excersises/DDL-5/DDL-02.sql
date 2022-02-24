INSERT INTO dept
    SELECT department_id, department_name
    FROM departments;
    
SELECT * FROM dept;

INSERT INTO dept VALUES (10, 'Accounts');
INSERT INTO dept VALUES (NULL, 'IT');
INSERT INTO dept VALUES (20, 'IT');
INSERT INTO dept VALUES (A1, 'Accounts');
INSERT INTO dept VALUES (30, 'Accounts');