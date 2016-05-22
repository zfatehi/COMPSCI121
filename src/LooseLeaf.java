public class LooseLeaf
{
  // models a looseleaf notebook, counts blank sheets
  private int blankPages;
  private String name; // notebook owner

  public LooseLeaf(String who, int blanks)
  {
    blankPages = blanks;
    name = who;
  }

  public int getBlankPages()
  {
    return blankPages;
  }

  public String getName()
  {
    return name;
  }

  public void setBlankPages(int amount)
  {
    blankPages = amount;
  }
  
}
