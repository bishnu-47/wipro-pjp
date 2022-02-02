package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {
	DailyTasks dt;

	@Before
	public void setUp() {
		dt = new DailyTasks();
	}

	@Test
	public void shouldReturntrue() {
		assertTrue(dt.checkPresence("wipro", "pro"));
	}

	@Test
	public void shouldReturnFalse() {
		assertFalse(dt.checkPresence("wipro", "hi"));
	}
}
