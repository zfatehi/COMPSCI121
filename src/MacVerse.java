public class MacVerse
{
  private String name;
  private String noise;

  public MacVerse(String animalName, String animalNoise)
  {
    name = animalName;
    noise = animalNoise;
  }

  public String getName()
  {
    return name;
  }

  public String getNoise()
  {
    return noise;
  };

  public void verse()
  {
    System.out.println("and on that farm he had a " + name);
    System.out.println("ei ei O");
    System.out.println("With a " + noise + " " + noise + " here");
    System.out.println("And a " + noise + " " + noise + " there");
    System.out.println("Here a " + noise + " there a " + noise);
    System.out.println("Everywhere a " + noise + " " + noise);
  }
  
}
