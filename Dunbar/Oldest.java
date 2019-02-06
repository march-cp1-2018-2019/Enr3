package chap11;

// Noah 2/6/2019

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

// Noah 2/6/2019

public class Oldest{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    LocalDate[] dates = new LocalDate[5];
    DateTimeFormatter inputDtf = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH);

    System.out.println("Date format: MM/DD/YYYY\n");

    for(int i = 0; i < 5; i++){
      System.out.print("Enter date-of-birth: ");
      String in = scanner.nextLine();

      try{
        dates[i] = LocalDate.parse(in, inputDtf);
      }catch(DateTimeParseException ex){
        System.out.println("Invalid date\nExiting");
        scanner.close();
        return;
      }
    }

    LocalDate oldest = dates[0];

    for(int i = 0; i < dates.length; i++){
      if(dates[i].isBefore(oldest)){
        oldest = dates[i];
      }
    }

    // calculate and print the oldest's age
    System.out.println("\nThe oldest person is " + ChronoUnit.YEARS.between(oldest, LocalDate.now()) + " years old");

    scanner.close();
  }
}