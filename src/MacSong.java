public class MacSong
{
  
  public static void main(String[] args)
  {
    MacChorus m = new MacChorus();
    MacVerse p = new MacVerse("pig", "oink");
    MacVerse d = new MacVerse("dog", "woof");
    m.chorus();
    p.verse();
    m.chorus();
    m.chorus(); // where does its information come from?
    d.verse(); // where does its information come from?
    m.chorus();
  }
  
}
