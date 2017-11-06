import static org.junit.Assert.*;

import org.junit.Test;

/** @author
 * Jacob Smith
 * This class contains the test cases for class List
 */

public class Worksheet1Test {

	@Test
	public void test1() { // Test for power method with positive values
		int m = 2;
		int n = 4;

		int z = 16;

		int output = Worksheet1.power(m, n);
		assertEquals(output,z);
	}

	@Test
	public void test2() { // Test for power method raised to power of 0
		int m = 2;
		int n = 0;

		int z = 1;

		int output = Worksheet1.power(m, n);
		assertEquals(output,z);
	}

	@Test
	public void test3() { // Test for power method with a base 0
		int m = 0;
		int n = 1;

		int z = 0;

		int output = Worksheet1.power(m, n);
		assertEquals(output,z);
	}

	@Test
	public void test4() { // Test for fastPower method with a base 0
		int m = 0;
		int n = 25;

		int z = 0;

		int output = Worksheet1.fastPower(m, n);
		assertEquals(output,z);
	}

	@Test
	public void test5() { // Test for fastPower method with different values
		int m = 3;
		int n = 11;

		int z = 177147;

		int output = Worksheet1.fastPower(m, n);
		assertEquals(output,z);
	}

	@Test
	public void test6() { // Test for fastPower method with different values
		int m = 10;
		int n = 0;

		int z = 1;

		int output = Worksheet1.fastPower(m, n);
		assertEquals(output,z);
	}

	@Test
	public void test7() { // Tests negateAll with different values

		List L = List.empty();
		L = List.cons(0, L);
		L = List.cons(8, L);
		L = List.cons(-5, L);
		L = List.cons(2, L);

		List m = List.empty();
		m = List.cons(0, m);
		m = List.cons(-8, m);
		m = List.cons(5, m);
		m = List.cons(-2, m);

		List output = Worksheet1.negateAll(L);

		assertEquals(output, m);
	}

	@Test
	public void test8() { // Tests negateAll with only 0's

		List L = List.empty();
		L = List.cons(0, L);
		L = List.cons(0, L);
		L = List.cons(0, L);
		L = List.cons(0, L);

		List m = List.empty();
		m = List.cons(0, m);
		m = List.cons(0, m);
		m = List.cons(0, m);
		m = List.cons(0, m);

		List output = Worksheet1.negateAll(L);

		assertEquals(output, m);
	}

	@Test
	public void test9() { // Tests negateAll with an empty list

		List L = List.empty();
		L = List.cons(0, List.empty());

		List m = List.empty();
		m = List.cons(0, List.empty());

		List output = Worksheet1.negateAll(L);

		assertEquals(output, m);
	}

	@Test
	public void test10() { // Tests find with different values

		List L = List.empty();
		L = List.cons(0, L);
		L = List.cons(8, L);
		L = List.cons(5, L);
		L = List.cons(2, L);

		int output = Worksheet1.find(5, L);

		assertEquals(output, 1);
	}

	@Test
	public void test11() { // Tests find with different values

		List L = List.empty();
		L = List.cons(0, L);
		L = List.cons(8, L);
		L = List.cons(5, L);
		L = List.cons(2, L);

		int output = Worksheet1.find(0, L);

		assertEquals(output, 3);
	}

	@Test
	public void test12() { // Tests find with different values

		List L = List.empty();
		L = List.cons(0, L);
		L = List.cons(2, L);
		L = List.cons(2, L);
		L = List.cons(2, L);

		int output = Worksheet1.find(2, L);

		assertEquals(output, 0);
	}

	@Test
	public void test13() { // Tests allPositive with different values

		List L = List.empty();
		L = List.cons(0, L);
		L = List.cons(8, L);
		L = List.cons(-5, L);
		L = List.cons(2, L);

		boolean output = Worksheet1.allPositive(L);

		assertEquals(output, false);
	}

	@Test
	public void test14() { // Tests allPositives with 0's

		List L = List.empty();
		L = List.cons(0, L);
		L = List.cons(0, L);
		L = List.cons(3, L);
		L = List.cons(5, L);

		boolean output = Worksheet1.allPositive(L);

		assertEquals(output, true);
	}

	@Test
	public void test15() { // Tests allPositive with an empty list

		List L = List.empty();

		boolean output = Worksheet1.allPositive(L);

		assertEquals(output, true);
	}

	@Test
	public void test16() { // Tests positives with different values

		List L = List.empty();
		L = List.cons(1, L);
		L = List.cons(4, L);
		L = List.cons(-2, L);
		L = List.cons(-3, L);

		List m = List.empty();
		m = List.cons(1, m);
		m = List.cons(4, m);

		List output = Worksheet1.positives(L);

		assertEquals(output, m);
	}

	@Test
	public void test17() { // Tests positives with 0's

		List L = List.empty();
		L = List.cons(0, L);
		L = List.cons(0, L);

		List m = List.empty();
		m = List.cons(0, m);
		m = List.cons(0, m);

		List output = Worksheet1.positives(L);

		assertEquals(output, m);
	}

	@Test
	public void test18() { // Tests positives with only a head

		List L = List.empty();
		L = List.cons(1, L);

		List m = List.empty();
		m = List.cons(1, m);

		List output = Worksheet1.positives(L);

		assertEquals(output, m);
	}

	@Test
	public void test19() { // Tests sorted with different values

		List L = List.empty();
		L = List.cons(0, L);
		L = List.cons(8, L);
		L = List.cons(-5, L);
		L = List.cons(2, L);

		boolean output = Worksheet1.sorted(L);

		assertEquals(output, false);
	}

	@Test
	public void test20() { // Tests sorted with only a head

		List L = List.empty();

		L = List.cons(2, L);

		boolean output = Worksheet1.sorted(L);

		assertEquals(output, true);
	}

	@Test
	public void test21() { // Tests sorted with different values

		List L = List.empty();
		L = List.cons(8, L);
		L = List.cons(1, L);
		L = List.cons(-2, L);
		L = List.cons(-5, L);

		boolean output = Worksheet1.sorted(L);

		assertEquals(output, true);
	}

	@Test
	public void test22() { // Tests merge with different values on a sorted list

		List L = List.empty();
		L = List.cons(6, L);
		L = List.cons(5, L);
		L = List.cons(4, L);

		List n = List.empty();
		n = List.cons(3, n);
		n = List.cons(2, n);
		n = List.cons(1, n);

		List m = List.empty();
		m = List.cons(6, m);
		m = List.cons(5, m);
		m = List.cons(4, m);
		m = List.cons(3, m);
		m = List.cons(2, m);
		m = List.cons(1, m);

		List output = Worksheet1.merge(L, n);

		assertEquals(output, m);
	}

	@Test
	public void test23() { // Tests merge with only heads a sorted list

		List L = List.empty();
		L = List.cons(6, L);

		List n = List.empty();
		n = List.cons(3, n);

		List m = List.empty();
		m = List.cons(6, m);
		m = List.cons(3, m);

		List output = Worksheet1.merge(L, n);

		assertEquals(output, m);
	}

	@Test
	public void test24() { // Tests merge with a duplicate value on a sorted list

		List L = List.empty();
		L = List.cons(6, L);
		L = List.cons(5, L);
		L = List.cons(1, L);

		List n = List.empty();
		n = List.cons(3, n);
		n = List.cons(2, n);
		n = List.cons(2, n);

		List m = List.empty();
		m = List.cons(6, m);
		m = List.cons(5, m);
		m = List.cons(3, m);
		m = List.cons(2, m);
		m = List.cons(2, m);
		m = List.cons(1, m);

		List output = Worksheet1.merge(L, n);

		assertEquals(output, m);
	}

	@Test
	public void test25() { // Tests removeDuplicates with different values

		List L = List.empty();
		L = List.cons(3, L);
		L = List.cons(3, L);
		L = List.cons(2, L);
		L = List.cons(2, L);
		L = List.cons(1, L);

		List m = List.empty();
		m = List.cons(3, m);
		m = List.cons(2, m);
		m = List.cons(1, m);

		List output = Worksheet1.removeDuplicates(L);

		assertEquals(output, m);
	}

	@Test
	public void test26() { // Tests removeDuplicates with no duplicates

		List L = List.empty();
		L = List.cons(3, L);
		L = List.cons(2, L);
		L = List.cons(1, L);

		List m = List.empty();
		m = List.cons(3, m);
		m = List.cons(2, m);
		m = List.cons(1, m);

		List output = Worksheet1.removeDuplicates(L);

		assertEquals(output, m);
	}

	@Test
	public void test27() { // Tests removeDuplicates with only a head

		List L = List.empty();
		L = List.cons(3, L);


		List m = List.empty();
		m = List.cons(3, m);

		List output = Worksheet1.removeDuplicates(L);

		assertEquals(output, m);
	}
}
