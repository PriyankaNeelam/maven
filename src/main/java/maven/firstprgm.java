package maven;

import org.testng.annotations.*;
public class firstprgm {
	 @BeforeClass
	 private void beforeClass() {
		System.out.println("Before Class");
		}
	    @BeforeMethod
	    private void beforeMethod() {
			System.out.println("Before Method");
		}
	    @AfterClass
	    private void afterClass() {
			System.out.println("After Class");
		}
	    @AfterMethod
	    private void afterMethod() {
			System.out.println("After Method");
		}
	    @Test
	    private void test1() {
			System.out.println("test1");
	}
	}


