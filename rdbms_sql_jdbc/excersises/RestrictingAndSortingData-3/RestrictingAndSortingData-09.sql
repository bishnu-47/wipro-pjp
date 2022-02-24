SELECT last_name, salary, commission_pct
    FROM employees 
    WHERE commission_pct IS NOT NULL
    order by 2, 3;
