
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Oldest {

	public static void main(String[] args) {
		boolean worked = true;
		String oldestName = "";
		LocalDate oldestBirthday = LocalDate.of(1, 1, 1);
		System.out.println("Welcome to the Oldest Age Calculator\n");

		LocalDate CurrentDate = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, YYYY");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (int x = 1; x < 6; x++) {
			System.out.println("\n");
			System.out.println("This is " + x + " Out Of 5 People");
			System.out.print("Please Enter A Name To Go With Your Date: ");
			String oldestNameTest = sc.nextLine();
			System.out.print("Now Enter your date of birth (YYYY-MM-DD): ");
			String dateOfBirthString = sc.nextLine();
			System.out.println();
			boolean valid;
			try {
				String[] parts = dateOfBirthString.split("-");
				int year = Integer.parseInt(parts[0]);
				int month = Integer.parseInt(parts[1]);
				int dayOfMonth = Integer.parseInt(parts[2]);
				valid = true;
				LocalDate birthdayTest = LocalDate.of(year, month, dayOfMonth);

				if (valid) {
					System.out.println("\n" + oldestNameTest + "'s birthday is " + dtf.format(birthdayTest));

					// DONE :)
					if (x == 1) {
						oldestBirthday = LocalDate.of(year, month, dayOfMonth);
						oldestName = oldestNameTest;
					} else {
						boolean testBirthdays = birthdayTest.isBefore(oldestBirthday);
						if (testBirthdays) {
							oldestBirthday = LocalDate.of(year, month, dayOfMonth);
							oldestName = oldestNameTest;
						}

					}
				}
			} catch (Exception e) {
				worked = false;
				break;

			}
		}
		if (worked == false) {
			System.out.println("\n\nYou Have Entered An Incorrect Date Or");
			System.out.println("Something That Is Not A Date...");
		} else {
			System.out.println("\n\nThe Oldest Person Was " + oldestName);
			System.out.println("His Birthday Is " + dtf.format(oldestBirthday));
		}
	}
}
