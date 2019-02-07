package chap11;
/** Made by Jeremiah
*
*p.s. I couldn't figure out how to use
* "LocalDate birthday = LocalDate.parse(b, formatter);"
* so I just changed it to what I know how to do...
*
*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class WhatsWrong {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("It is " + now);
		
		DateTimeFormatter dtfShort = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		
		System.out.println("Formatted = " + dtfShort.format(now));
		
		System.out.println("What is your birthday? (MM/dd/yyyy)");
		
		String b = scanner .nextLine();
		
		try {
			String[] parts = b.split("/");
			int year = Integer.parseInt(parts[2]);
			int month = Integer.parseInt(parts[0]);
			int dayOfMonth = Integer.parseInt(parts[1]);
			
			LocalDate birthday = LocalDate.of(year, month, dayOfMonth);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd, yyyy");
			
			System.out.println("Your birthday is = " + formatter.format(birthday));
		}catch (Exception e) {
			System.out.println("I could not turn your input in to a day");
		}
		
		
	}

}
