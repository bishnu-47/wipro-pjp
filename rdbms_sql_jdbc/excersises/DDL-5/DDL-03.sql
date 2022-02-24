CREATE TABLE EMP(
    id NUMBER(7) CONSTRAINT pk_id PRIMARY KEY,
    last_name VARCHAR2(25) NOT NULL,
    first_name VARCHAR2(25) NOT NULL,
    dept_id NUMBER(7),
    CONSTRAINT fk_dept_id FOREIGN KEY(dept_id) REFERENCES dept(dept_id)
);

INSERT INTO emp VALUES(101, 'Sam', 'Sundar', 10);
INSERT INTO emp VALUES(101, 'Ram', 'Krishna', 20);
INSERT INTO emp VALUES(102, 'Gopi', NULL, 40);
INSERT INTO emp VALUES(103, NULL, 'ram', 20);