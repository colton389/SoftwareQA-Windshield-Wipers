
import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class windshieldWiperTest {
	private static windshieldWiper testCase;
	
	@BeforeClass
	public   static void setUpObjects()
    {
        testCase = new windshieldWiper(0, "OFF", 1);
    }
	
	@Test
	public void T1() {
		setUpObjects();
		testCase.setDialPosition(1);
		testCase.setWiperSpeed(0);
		testCase.setLeverPosition("OFF");
		//testCase = new windshieldWiper(0,"OFF",1);
		try {
			testCase.senseLeverUp();
			assertEquals(4, testCase.getWiperSpeed());
		}catch(LeverErrorException e) {
			fail("LeverErrorException not expected");
		}
	}
	@Test
	public void T2() {
		testCase.setDialPosition(2);
		testCase.setWiperSpeed(0);
		testCase.setLeverPosition("OFF");
		try {
			testCase.senseLeverUp();
			assertEquals(6, testCase.getWiperSpeed());
		}catch(LeverErrorException e) {
			fail("LeverErrorException not expected");
		}
	}
	@Test
	public void T3() {
		testCase.setDialPosition(3);
		testCase.setWiperSpeed(0);
		testCase.setLeverPosition("OFF");
		try {
			testCase.senseLeverUp();
			assertEquals(12, testCase.getWiperSpeed());
		}catch(LeverErrorException e) {
			fail("LeverErrorException not expected");
		}
	}
	@Test
	public void T4() {
		testCase.setDialPosition(1);
		testCase.setWiperSpeed(4);
		testCase.setLeverPosition("INT");
		try {
			testCase.senseLeverDown();
			assertEquals(0, testCase.getWiperSpeed());
		}catch(LeverErrorException e) {
			fail("LeverErrorException not expected");
		}
	}
	@Test
	public void T5() {
		testCase.setDialPosition(2);
		testCase.setWiperSpeed(6);
		testCase.setLeverPosition("INT");
		try {
			testCase.senseLeverDown();
			assertEquals(0, testCase.getWiperSpeed());
		}catch(LeverErrorException e) {
			fail("LeverErrorException not expected");
		}
	}
	@Test
	public void T6() {
		testCase.setDialPosition(3);
		testCase.setWiperSpeed(12);
		testCase.setLeverPosition("INT");
		try {
			testCase.senseLeverDown();
			assertEquals(0, testCase.getWiperSpeed());
		}catch(LeverErrorException e) {
			fail("LeverErrorException not expected");
		}
	}
	@Test
	public void T7() {
		testCase.setDialPosition(1);
		testCase.setWiperSpeed(4);
		testCase.setLeverPosition("INT");
		try {
			testCase.senseLeverUp();
			assertEquals(30, testCase.getWiperSpeed());
		}catch(LeverErrorException e) {
			fail("LeverErrorException not expected");
		}
	}
	@Test
	public void T8() {
		testCase.setDialPosition(2);
		testCase.setWiperSpeed(6);
		testCase.setLeverPosition("INT");
		try {
			testCase.senseLeverUp();
			assertEquals(30, testCase.getWiperSpeed());
		}catch(LeverErrorException e) {
			fail("LeverErrorException not expected");
		}
	}
	@Test
	public void T9() {
		testCase.setDialPosition(3);
		testCase.setWiperSpeed(12);
		testCase.setLeverPosition("INT");
		try {
			testCase.senseLeverUp();
			assertEquals(30, testCase.getWiperSpeed());
		}catch(LeverErrorException e) {
			fail("LeverErrorException not expected");
		}
	}
	@Test
	public void T10() {
		testCase.setDialPosition(1);
		testCase.setWiperSpeed(30);
		testCase.setLeverPosition("LOW");
		try {
			testCase.senseLeverDown();
			assertEquals(4, testCase.getWiperSpeed());
		}catch(LeverErrorException e) {
			fail("LeverErrorException not expected");
		}
	}
	@Test
	public void T11() {
		testCase.setDialPosition(2);
		testCase.setWiperSpeed(30);
		testCase.setLeverPosition("LOW");
		try {
			testCase.senseLeverDown();
			assertEquals(6, testCase.getWiperSpeed());
		}catch(LeverErrorException e) {
			fail("LeverErrorException not expected");
		}
	}
	@Test
	public void T12() {
		testCase.setDialPosition(3);
		testCase.setWiperSpeed(30);
		testCase.setLeverPosition("LOW");
		try {
			testCase.senseLeverDown();
			assertEquals(12, testCase.getWiperSpeed());
		}catch(LeverErrorException e) {
			fail("LeverErrorException not expected");
		}
	}
	@Test
	public void T13() {
		testCase.setDialPosition(3);
		testCase.setWiperSpeed(30);
		testCase.setLeverPosition("LOW");
		try {
			testCase.senseLeverUp();
			assertEquals(60, testCase.getWiperSpeed());
		}catch(LeverErrorException e) {
			fail("LeverErrorException not expected");
		}
	}
	@Test
	public void T14() {
		testCase.setDialPosition(3);
		testCase.setWiperSpeed(30);
		testCase.setLeverPosition("HIGH");
		try {
			testCase.senseLeverDown();
			assertEquals(30, testCase.getWiperSpeed());
		}catch(LeverErrorException e) {
			fail("LeverErrorException not expected");
		}
	}

}
