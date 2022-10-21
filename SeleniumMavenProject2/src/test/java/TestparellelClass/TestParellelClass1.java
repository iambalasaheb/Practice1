package TestparellelClass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestParellelClass1 {

	@Test
	public void testCaseOne() {
		// Printing class name and Id of the thread on using which test method got executed
		System.out.println("Test Case One in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
	}

	@Test
	public void testCaseTwo() {
		 //Printing class name and Id of the thread on using which test method got executed
		System.out.println("Test Case two in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
	}

}
