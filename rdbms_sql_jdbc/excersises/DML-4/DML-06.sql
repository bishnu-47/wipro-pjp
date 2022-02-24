INSERT INTO my_employee
    SELECT employee_id, first_name, last_name, department_id, salary
      FROM employees
      WHERE employee_id IN (205, 204, 100, 101, 102, 111, 112);

SELECT * FROM my_employee;
