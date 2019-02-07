package week3enr;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

//Stephen Russell

public class WhatsWrong {

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("It is " + now);
		
		DateTimeFormatter dtfShort = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		
		System.out.println("Formatted = " + dtfShort.format(now));
		
		System.out.println("What is your birthday? (MM/dd/yyyy)");
		
		String b = Scanner.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate birthday = LocalDate.parse(b, formatter);

		System.out.println("Your birthday is = " + birthday);
	}		
		
}
