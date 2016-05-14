
public class PrintingStringsAndNumbers
{

  public static void main(String[] args)
  {
    // Slide 1

    // Print on a separate line
    System.out.println("Stuff I want to say.");

    // You can add strings together
    System.out.println("Sch" + "wing");

    // You can add numbers, and print the result
    System.out.println(3 + 5);

    // But, this is a string as a whole
    System.out.println("3 + 5");

    // Putting strings together
    System.out.println("3" + "5");

    // Slide 2

    // Convert 5 to a string "5", first, if there is a string involved
    System.out.println(5 + "a");

    // Convert 5 to a string "5", first, if there is a string involved
    System.out.println("a" + 5);

    // Mixtures of strings and numbers
    // • number + number --> number
    // • string + string --> string
    // • number + string --> string
    // • string + number --> string

    // Strings and numbers

    System.out.println(3 + 5 + "a" + 3 + 5);
  }

}
