package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

	public String findGrades(Student studentObject) {
		int sum = 0;
		for (int marks : studentObject.getMarks()) {
			// early return if any subject marks is < 35
			if (marks < 35) {
				return "F";
			}

			sum += marks;
		}

		// find grade based on marks
		if (sum < 150)
			return "C";
		else if (sum < 200)
			return "D";
		else if (sum < 250)
			return "A";
		else
			return "A+";
	}

	public String validate(Student s) throws NullNameException, NullMarksArrayException, NullStudentObjectException {
		// if student obj is null
		if (s == null) {
			throw new NullStudentObjectException();
		}

		// if data inside student obj is null
		if (s.getName() == null) {
			throw new NullNameException();
		} else if (s.getMarks() == null) {
			throw new NullMarksArrayException();
		} else {
			return "VALID";
		}

	}
}
