package com.mile1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

class TestStudent {
	StudentReport sr = new StudentReport();
	StudentService ss = new StudentService();
	Student[] s;

	@BeforeEach
	public void init() {
		s = new Student[7];
		s[0] = new Student("Sekar", new int[] { 85, 75, 95 });
		s[1] = new Student(null, new int[] { 11, 22, 33 });
		s[2] = null;
		s[3] = new Student("Manoj", null);
		s[4] = new Student("Ram", new int[] { 95, 88, 78, 65, 80 });
		s[5] = new Student("Shyam", new int[] { 40, 40, 40, 37, 40 });
		s[6] = new Student("Rita", new int[] { 33, 80, 70, 37, 40 });
	}

	// grade calculation for valid object
	@DisplayName("ShouldAssertEqualAplus")
	@Test
	void TC1() {
		String grade = sr.findGrades(s[4]);
		assertEquals("A+", grade);
	}

	@DisplayName("ShouldAssertEqualD")
	@Test
	void TC2() {
		String grade = sr.findGrades(s[5]);
		assertEquals("D", grade);
	}

	@DisplayName("ShouldAssertEqualF")
	@Test
	void TC3() {
		String grade = sr.findGrades(s[6]);
		assertEquals("F", grade);
	}

	// throw error message for invalid message
	@DisplayName("ShouldThrowNullStudentException")
	@Test
	void TC4() {
		assertThrows(NullStudentObjectException.class, () -> sr.validate(s[2]));
	}

	@DisplayName("ShouldThrowNullNameException")
	@Test
	void TC5() {
		assertThrows(NullNameException.class, () -> sr.validate(s[1]));
	}

	@DisplayName("ShouldThrowNullMarksArrayException")
	@Test
	void TC6() {
		assertThrows(NullMarksArrayException.class, () -> sr.validate(s[3]));
	}

	// counting the null
	@DisplayName("TestFindNumberOfNullName")
	@Test
	void TC7() {
		assertEquals(1, ss.findNumberOfNullName(s));
	}

	@DisplayName("TestFindNumberOfNullObjects")
	@Test
	void TC8() {
		assertEquals(1, ss.findNumberOfNullObjects(s));
	}

	@DisplayName("TestFindNumberOfNullMarks")
	@Test
	void TC9() {
		assertEquals(1, ss.findNumberOfNullMarksArray(s));
	}
}
