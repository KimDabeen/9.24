package test;



import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import classPart.FuctionTest;

class AddTest {

	void test() {
		assertTrue(0 == FuctionTest.add(0, 0));
		//���� add(0,0) ������ 0�ΰ��� ������ �Ǵ°�?
		assertTrue(7 == FuctionTest.add(3, 4));
		assertFalse(8 == FuctionTest.add(3, 4));
		//���� add(3,4) ������ 8�� �ƴѰ�?
	}

}
