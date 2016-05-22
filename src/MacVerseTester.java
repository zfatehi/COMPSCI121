import java.util.Scanner;

public class MacVerseTester
{
  
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an animal name");
    String animal = scan.next();
    System.out.println("Enter that animal's noise");
    String noise = scan.next();
    MacVerse someAnimal = new MacVerse(animal, noise);
    someAnimal.verse();
  }
  
}
