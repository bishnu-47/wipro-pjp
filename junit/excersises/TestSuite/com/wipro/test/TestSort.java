package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestSort {
	DailyTasks dt;
	int[] normalArr, sameElementsArr;

	@Before
	public void setUp() {
		dt = new DailyTasks();
		normalArr = new int[] { 5, 4, 2, 1, 3 };
		sameElementsArr = new int[] { 1, 1, 1, 1, 1, 1 };
	}

	@Test
	public void shouldCorrectlySortTheArray() {
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, dt.sortValues(normalArr));
	}

	@Test
	public void shouldReturnSameValueForSameElementsInArray() {
		assertArrayEquals(sameElementsArr, dt.sortValues(sameElementsArr));
	}
}
