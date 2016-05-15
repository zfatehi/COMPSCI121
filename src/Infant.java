
public class Infant {

	private String name;
	private int age; // age in months

	// no return type, and method name is the same name as the class- this helps
	// create new objects and is called a constructor
	// the constructor is used to set the object's initial state
	// the reason that you assign who to this.name and months to this.age is because Java
	// doesn't know if you want to do something with who or months; for example,
	// you may want to do months/12 to get years

	public Infant(String who, int months) {
		this.name = who;
		this.age = months;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	// this is behavior, and it can change state, away from the initial state
	public void anotherMonth() {
		this.age = this.age + 1;
	}

}
