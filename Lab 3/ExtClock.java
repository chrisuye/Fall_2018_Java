public class ExtClock extends Clock
{
  int zone;
  
  public ExtClock()
  {
    super();
    zone = 0;
  }
  public ExtClock(int hour, int min, int sec,int z)
  {
    super(hour,min,sec);
    zone = z;
  }
  public void setZone(int z)
  {
    if(z>=-14 || z<=12)
    {
    zone = z;
    }
    else
    {
      System.err.println("WRONG TIME ZONE!");
    }
    
  }
  public int getZone()
  {
    return zone;
  }
  public void printTime()
  {
    super.printTime();
    System.out.println("\nTime Zone: "+zone);
  }
  public void makeCopy(ExtClock otherClock)
  {
     super.makeCopy(otherClock);
     zone = otherClock.zone;
  
  }
  
  public ExtClock getCopy()
  {
    ExtClock temp = new ExtClock();
    
    super.getCopy();
    temp.zone = zone;
    
    return temp;
  }
}