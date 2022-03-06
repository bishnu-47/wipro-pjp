package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {

	public int findNumberOfNullMarksArray(Student s[]) {
		int c = 0;

		try {
			if (s != null) {
				for (Student student : s) {
					if (student != null) {
						if (student.getMarks() == null) {
							c++;
						}
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return c;
	}

	public int findNumberOfNullName(Student s[]) {
		int c = 0;

		try {
			if (s != null) {
				for (Student student : s) {
					if (student != null) {
						if (student.getName() == null) {
							c++;
						}
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return c;
	}

	public int findNumberOfNullObjects(Student s[]) {
		int c = 0;

		try {
			if (s != null) {
				for (Student student : s) {
					if (student == null) {
						c++;
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return c;
	}
}
