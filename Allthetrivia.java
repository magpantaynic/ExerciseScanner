import java.util.Scanner;

public class Allthetrivia {
  public static void main(String[] args) {
  Scanner inputReader = new Scanner(System.in);
  Integer units = 0;
  String planet = "";
  String volcanoe = "";
  String element = "";
  
  
  System.out.print("What unit is equivalent to 1,024 Gigabytes?");
  units = Integer.parseInt(inputReader.nextLine());
  System.out.println("Which planet is the only one that rotates clockwise in our Solar System?");
  planet = inputReader.nextLine();
  System.out.println("The largest volcano ever discovered in our Solar System is located on which planet?" );
  volcanoe = inputReader.nextLine();
  System.out.println("What is the most abundant element in the earth's atmosphere?");
  element = inputReader.nextLine();
  System.out.println("Wow, 1,024 Gigabytes is a" + planet);
  System.out.println("I didn't know that the largest ever volcano was discovered on" + units +"!"); 
  System.out.println("That's amazing that" + planet + "is the most abundant element in the atmosphere..."); 
  System.out.println(element + " is the only planet that rotates clockwise, neat!"); 
  
  }
}
