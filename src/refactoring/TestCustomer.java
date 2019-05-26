package refactoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCustomer {

	@Test
	void testStatement() {
		Customer c1 = new Customer("C_name");

		assertEquals("Rental Record for C_name\n" + "Amount owed is 0.0\n" + "You earned 0 frequent renter points",
				c1.statement());

		Movie m1 = new Movie("M1", Movie.REGULAR);
		c1.addRental(new Rental(m1, 10));

		assertEquals("Rental Record for C_name\n" + "\tM1\t14.0\n" + "Amount owed is 14.0\n"
				+ "You earned 1 frequent renter points", c1.statement());

		Movie m2 = new Movie("M2", Movie.NEW_RELEASE);
		c1.addRental(new Rental(m2, 10));

		assertEquals("Rental Record for C_name\n" + "\tM1\t14.0\n" + "\tM2\t30.0\n" + "Amount owed is 44.0\n"
				+ "You earned 3 frequent renter points", c1.statement());

	}

}
