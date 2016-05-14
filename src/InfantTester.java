
public class InfantTester
{

  public static void main(String[] args)
  {
    Infant myKid = new Infant("Lizzie", 4);
    int lizAge = myKid.getAge();
    System.out.println("my kid's name is " + myKid.getName());
    myKid.anotherMonth();
    System.out.println("my kid's age is now " + myKid.getAge() + " months");
  }

}
