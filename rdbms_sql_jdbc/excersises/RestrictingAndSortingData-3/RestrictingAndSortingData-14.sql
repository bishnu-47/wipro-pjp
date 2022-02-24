SELECT last_name, job_id, salary
    FROM employees
    WHERE job_id IN ('ST_CLERK', 'SA_REP')
    AND salary NOT IN (2500, 3500, 7000);
