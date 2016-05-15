
public class InfantTester2 {

	public static void main(String[] args) {

		// here we created a new object tasneemsKid to show that objects in the
		// same class are independent of one another and you can change the sate
		// of each object independently
		
		Infant myKid = new Infant("Lizzie", 4);
		Infant tasneemsKid = new Infant("Gabriel", 6);

		System.out.println("my kid's name is " + myKid.getName());
		System.out.println("my kid's age is " + myKid.getAge() + " months");
		myKid.anotherMonth();
		System.out.println("my kid's age is now " + myKid.getAge() + " months");

		System.out.println("Tasneem's kid's name is " + tasneemsKid.getName());
		System.out.println("Tasneem's kid's age is " + tasneemsKid.getAge() + " months");
	}
}
