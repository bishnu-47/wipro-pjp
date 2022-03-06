package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
	static Student data[] = new Student[4];

	public StudentMain() {
		for (int i = 0; i < data.length; i++) {
			data[i] = new Student();
		}

		data[0] = new Student("Sekar", new int[] { 85, 75, 95 });
		data[1] = new Student(null, new int[] { 11, 22, 33 });
		data[2] = null;
		data[3] = new Student("Manoj", null);
	}

	public static void main(String[] args) {
		StudentReport sr = new StudentReport();
		new StudentMain();

		try {
			for (Student s : data) {
				String isValid = sr.validate(s);

				if (isValid.equals("VALID")) {
					System.out.println(s.getName() + " is awarded with " + sr.findGrades(s) + " grade.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		StudentService ss = new StudentService();
		System.out.println("Number of null marks array: " + ss.findNumberOfNullMarksArray(data));
		System.out.println("Number of null name: " + ss.findNumberOfNullName(data));
		System.out.println("Number of null objects: " + ss.findNumberOfNullObjects(data));
	}
}
