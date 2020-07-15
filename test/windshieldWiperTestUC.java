import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class windshieldWiperTestUC {

	private static windshieldWiper testCase;
	@BeforeClass
    public   static void setUpObjects()
    {
        testCase = new windshieldWiper(0, "OFF", 1);
    }
		
	@Test
	public void UC1() {
		setUpObjects();
		try {
			testCase.senseLeverUp();
			assertEquals(4, testCase.getWiperSpeed());
		}catch(LeverErrorException e) {
			fail("LeverErrorException not expected");
		}
	}
	public void UC2() {	
		try{
            testCase.senseDialUp();
            assertEquals(6, testCase.getWiperSpeed());
        } catch (DialErrorException e) {
            fail("DialErrorException not expected");
        }
	}
	public void UC3() {
		try{
            testCase.senseDialUp();
            assertEquals(12, testCase.getWiperSpeed());
        } catch (DialErrorException e) {
            fail("LeverErrorException not expected");
        }
	}
	public void UC4() {
		try {
			testCase.senseLeverUp();
			assertEquals(30, testCase.getWiperSpeed());
		}catch(LeverErrorException e) {
			fail("LeverErrorException not expected");
		}
	}
	public void UC5() {
		try {
			testCase.senseLeverDown();
			assertEquals(12, testCase.getWiperSpeed());
		}catch(LeverErrorException e) {
			fail("LeverErrorException not expected");
		}
	}
	public void UC6() {
		try {
			testCase.senseLeverDown();
			assertEquals(0, testCase.getWiperSpeed());
			assertEquals("OFF", testCase.getLeverPosition());
			assertEquals(3, testCase.getDialPosition());
		}catch(LeverErrorException e) {
			fail("LeverErrorException not expected");
		}	
	}
	public void UC7() {
		assertEquals(0, testCase.getWiperSpeed());
		assertEquals("OFF", testCase.getLeverPosition());
		assertEquals(3, testCase.getDialPosition());
	}
	
}
