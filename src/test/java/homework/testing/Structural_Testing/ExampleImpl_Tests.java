package homework.testing.Structural_Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


public class ExampleImpl_Tests {


	  /**
	   * Tests the example function for a string with two contiguous space strings
	   * input of "  vai   bhav" should return back 2
	   */
	 @Test
	  void example_two_Test() {
	   	UnitTestImpl testObj = new UnitTestImpl();
	  	assertEquals(2,testObj.example("  vai   bhav"));
	  }
	 
	  /**
	   * Tests the example function for a string with two contiguous space strings
	   * input of "vai   bhav  " should return back 2
	   */
	 @Test
	  void example_trailing_Test() {
	   	UnitTestImpl testObj = new UnitTestImpl();
	  	assertEquals(2,testObj.example("vai   bhav  "));
	  }
	 
	 

	  /**
	   * Tests the example function for a string with one contiguous space strings
	   * input of " vai  bhav " should return back 1
	   */
	 @Test
	  void example_one_Test() {
	   	UnitTestImpl testObj = new UnitTestImpl();
	  	assertEquals(1,testObj.example(" vai  bhav"));
	  }
	 
	  /**
	   * Tests the example function for an empty string which should return 0
	   * input of "" should return back 0
	   */
	 @Test
	  void example_empty_Test() {
	   	UnitTestImpl testObj = new UnitTestImpl();
	  	assertEquals(0,testObj.example(""));
	  }
	 
	  /**
	   * Tests the example function for a string with a single space should return back 0
	   * input of " " should return back 0
	   */
	 @Test
	  void example_space_Test() {
	   	UnitTestImpl testObj = new UnitTestImpl();
	  	assertEquals(0,testObj.example(" "));
	  }
	 
	  /**
	   * Tests the example function for a null input should throw a null pointer exception
	   * input of null should return back should throw a null pointer exception
	   */
	 @Test
	  void example_null_Test() {
	   	UnitTestImpl testObj = new UnitTestImpl();
        assertThrows(NullPointerException.class, () -> testObj.example(null));
	  }
	 
	
}
