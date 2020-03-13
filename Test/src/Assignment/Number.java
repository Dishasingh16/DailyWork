package Assignment;

public class Number {
	public static void main(String[] args) {

		int nibble = 0, number = 4234, nibbleIndex = 0;

		while (nibbleIndex > 0) {
			int division = number / 10;
			nibble = number - division * 10;
			number = division;

			nibbleIndex--;
		}

		System.out.println(+nibble);
	}
}
