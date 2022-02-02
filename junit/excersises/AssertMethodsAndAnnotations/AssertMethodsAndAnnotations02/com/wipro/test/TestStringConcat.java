package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestStringConcat {

	@Test
	public void shouldReturnHelloWorld() {
		DailyTasks dt = new DailyTasks();
		assertEquals("hello world", dt.doStringConcat("hello", "world"));
	}

}
