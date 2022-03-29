/* 
  Ask the user how many miles they can run, the number of hot dogs they can eat, and the number of languages they know. Immediately after each question, brag that you can do more by multiplying their number by 2 and adding 1.
*/

import java.util.Scanner;

public class DoItBetter {

  public static void main(String[] args) {

      Scanner inputReader = new Scanner(System.in);

      int milesUser;
      int hotDogs;
      int langUser;
    
      System.out.println("How many miles can you run?");
      milesUser = Integer.parseInt(inputReader.nextLine());

      System.out.println("That's it? Wow. I can run " + ((milesUser*2) + 1) + " miles");
    
      System.out.println("How many hot dogs can you eat?");
      hotDogs = Integer.parseInt(inputReader.nextLine());

      System.out.println("Interesting. I can eat " + ((hotDogs*2) + 1) + " hot dogs");
    
      System.out.println("How many languages can you speak?");
      langUser = Integer.parseInt(inputReader.nextLine());

      System.out.println("That's cool. I can speak  " + ((langUser*2) + 1) + " languages");

    // *2 + 1   
    
    }
  
}
