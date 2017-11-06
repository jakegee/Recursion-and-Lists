/**
 * @author Jacob Smith
 * Recursion solutions
 */

public class Worksheet1 implements Worksheet1Interface {

	public static int power(int m, int n) { // power raises the power n to base m
		if (n == 0) { // Anything raised to power 0 is
			return 1; // equal 1 to one
		} else
			return m * power(m, n - 1); // or else just m multiplied by power of n-1 to base m
	}

	public static int fastPower(int m, int n) { // fastPower raises the power n to base m
		if (n == 0) { // Same as above
			return 1;
		} else if (n % 2 == 0) { // when the remainder is 0
			int y = fastPower(m, n / 2); // y gets the power of m,then n divided by 2
			return y * y; // return y multiplied by y
		} else
			return m * fastPower(m, n - 1); // or else
	}

	public static List negateAll(List a) { // negateAll function makes positives into
		// negatives and vise versa
		if (a.isEmpty()) { // if the list is empty then
			throw new IllegalStateException(); // we throw a new illegal state exception
			// to let the new user know there's an issue
		} else if (a.getTail().isEmpty()) { // if only the tail is empty, but the head has a value.
			// A list is constructed with an empty tail, and a head that's subtracted by the head
			// multiplied by 2. This gives us our negated value for the head.
			return List.cons(a.getHead() - 2 * a.getHead(), (List.empty()));
		} else {
			// else we construct a list with the head the same way and the tail through
			// the negateAll function
			return List.cons(a.getHead() - 2 * a.getHead(), negateAll(a.getTail()));
		}
	}

	public static int find(int x, List a) { // find x searches for the index value pertaining to x
		// if the list is empty or there's an empty tail with a head that doesn't equal x
		if (a.isEmpty() || (a.getTail().isEmpty() && (a.getHead() != x))) {
			// return an illegal state exception
			throw new IllegalStateException();
			// else if x is the same value as the head return index 0
		} else if (x == a.getHead()) {
			return 0;
		} else {
			return find(x, a.getTail()) + 1; // or else use the find function to recursively
			//call through the list to find the index x is located
		}
	}

	public static boolean allPositive(List a) { // allPositive returns a true if a list has
		// all positive values including 0's or a false for a list with any negatives
		if (a.isEmpty()) { // an empty list is 0 so therefore returns true
			return true;
		} else if (a.getHead() < 0) { // any head with a value less than 0 is negative
			return false;	// therefore false
		}
		return (allPositive(a.getTail())); // the allPositive function checks the entire list
		// to give a true or false
	}

	public static List positives(List a) { // positives creates a list with only positive
		// values
		if (a.isEmpty()) { // Empty list gets the exception
			throw new IllegalStateException();
		} else if (!a.isEmpty() && a.getTail().isEmpty()) { // this checks if the list isn't
			// empty and a tail is empty
			if (a.getHead() >= 0) { // then the head has a value greater than or equal to 0
				return a; // return the list since it's just a head
			} else {
				return List.empty(); // or else return the empty list
			}
		} else if (a.getHead() >= 0) { // or else if the head is greater than or equal to 0
			return List.cons(a.getHead(), positives(a.getTail())); // construct a list with the
			// head and run the tail through the positives function
		} else {
			return positives(a.getTail()); // else just return the list after the positive function
		}
	}

	public static boolean sorted(List a) { // sorted returns a boolean true for sorted
		// lists or false for an unsorted listed
		if (a.isEmpty()) // Usual empty list argument
			throw new IllegalStateException();
		else if (a.getTail().isEmpty()) // if the tail is empty then return true as there
			// must be a head, therefore a single value is sorted
			return true;
		else if (a.getHead() > a.getTail().getHead()) // else if the head is larger than the
			// head of the tail (2nd value) return a false because that's not sorted
			return false;
		else
			return sorted(a.getTail()); // else just run the whole list through the sorted function
	}

	public static List merge(List a, List b) { // merge joins 2 sorted lists
		if (a.isEmpty() && (b.isEmpty())) { // Same exception that checks each list
			throw new IllegalStateException();
		} else if (a.isEmpty()) { // Checks if the first list is empty
			return b; // return the other sorted list
		} else if (b.isEmpty()) { // Checks the other list
			return a; // then returns the other sorted list
		}
		if (a.getHead() < b.getHead()) { // The head of the first list must be less than
			// the second list's head so that we return a constructed list beginning with the
			// first list's head, merge function through the tail of the first list, then the
			// second list
			return List.cons(a.getHead(), merge(a.getTail(), b));
		} else {
			// Else we just return a constructed list with b's head, merge function through
			// tail of b, and then the first list
			return List.cons(b.getHead(), merge(b.getTail(), a));
		}
	}

	static List removeDuplicates(List a) { // removeDuplicates functions removes any duplicates
		// from a list
		if (a.isEmpty()) { // Usual statement to throw an exception for an empty list
			throw new IllegalStateException();
		} else if (a.getTail().isEmpty()) // checks if the tail is empty
			return a; // return the list as it will be a single value list, head only
		else if (!(a.getHead() == a.getTail().getHead())) { // else if the head doesn't have the
			// same value of the head of the tail
			return List.cons(a.getHead(), removeDuplicates(a.getTail())); // return a constructed
			// list the head and the tail run through the removeDuplicates function
		} else {
			return removeDuplicates(a.getTail()); // else just run the removeDuplicates function
			// through the list's tail
		}
	}
}
