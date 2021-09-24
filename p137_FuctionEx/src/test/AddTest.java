package test;



import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import classPart.FuctionTest;

class AddTest {

	void test() {
		assertTrue(0 == FuctionTest.add(0, 0));
		//내가 add(0,0) 했을때 0인것이 보장이 되는가?
		assertTrue(7 == FuctionTest.add(3, 4));
		assertFalse(8 == FuctionTest.add(3, 4));
		//내가 add(3,4) 했을때 8이 아닌가?
	}

}
