CREATE OR REPLACE PROCEDURE calc_net_sal (
	p_empno IN emp.empno % TYPE,
	output OUT emp.sal % TYPE
) IS 
	p_comm emp.comm % TYPE;
	p_sal emp.sal % TYPE;

	gross_salary  emp.sal % TYPE;
	net_salary  emp.sal % TYPE;
	it  emp.sal % TYPE;
BEGIN 
	SELECT comm, sal INTO p_comm, p_sal FROM emp WHERE empno = p_empno;
    
    -- check if p_comm is null
    IF p_comm IS NULL THEN
        p_comm :=0;
    END IF;
    
    gross_salary := p_sal + p_comm;
    
	-- calc IT
    IF p_comm = 0 THEN
        IT := gross_salary * 0.1;
    ELSIF p_comm < 500 THEN
        IT := gross_salary * 0.15;
    ELSE
        IT := gross_salary * 0.2;
    END IF;

	net_salary := gross_salary - it;
	
	output := net_salary;
END calc_net_sal;
/
