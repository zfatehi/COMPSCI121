
public class Infant
{

  String name;
  int age;

  public Infant(String name, int age)
  {
    this.name = name;
    this.age = age;
  }

  public String getName()
  {
    return this.name;
  }

  public int getAge()
  {
    return this.age;
  }

  public void anotherMonth()
  {
    this.age = this.age + 1;
  }

}
