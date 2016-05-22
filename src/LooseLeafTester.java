public class LooseLeafTester
{
  
  public static void main(String[] args)
  {
    LooseLeaf jacksBook = new LooseLeaf("Jack", 50);
    LooseLeaf jillsBook = new LooseLeaf("Jill", 20);
    int jacksBlanks = jacksBook.getBlankPages();
    jacksBook.setBlankPages(jacksBlanks - 20);
    int jillsBlanks = jillsBook.getBlankPages();
    jillsBook.setBlankPages(jillsBlanks + 20);
    System.out.println(jillsBook.getBlankPages());
  }
  
}
