public class Day
  
{
  
  private String day;
  private int dnum;
  
  
  public Day()//set day to sunday
    
  {
    
    setday(0);
    
  }
  public Day(int pday)//set day based on the input
    
  {
    
    setday(pday);
    
  }
  
  public void setday(int pday)//setday
  {
    dnum = pday;
    if(pday == 0)
    {
      day = "Sun";
    }
    else if(pday == 1)
    {
      day = "Mon";
    }
    else if(pday == 2)
    {
      day = "Tue";
    }
    else if(pday == 3)
    {
      day = "Wed";
    }
    else if(pday == 4)
    {
      day = "Thr";
    }
    else if(pday == 5)
    {
      day = "Fri";
    }
    else if(pday == 6)
    {
      day = "Sat";
    }
  }
  
  
  /** * B. Print the day */
  
  public void print()//prints the day
    
  {
    
    System.out.println(day);
    
  }
  /** * C. Return the day. */
  
  public String getDay()
    
  {
    
    return day;
    
  }
  /** * D. Return the next day. */
  
  public String getNextDay()
    
  {
    dnum = (dnum + 1) % 7;
    if(dnum == 0)
    {
      day = "Sun";
    }
    else if(dnum == 1)
    {
      day = "Mon";
    }
    else if(dnum == 2)
    {
      day = "Tue";
    }
    else if(dnum == 3)
    {
      day = "Wed";
    }
    else if(dnum == 4)
    {
      day = "Thr";
    }
    else if(dnum == 5)
    {
      day = "Fri";
    }
    else if(dnum == 6)
    {
      day = "Sat";
    }
    return day;
    
  }
 
  /** * E. Return the previous day. */
  
  public String getPreviousDay()
    
  {
    
    dnum = (dnum - 1) % 7;
    if(dnum == 0)
    {
      day = "Sun";
    }
    else if(dnum == 1)
    {
      day = "Mon";
    }
    else if(dnum == 2)
    {
      day = "Tue";
    }
    else if(dnum == 3)
    {
      day = "Wed";
    }
    else if(dnum == 4)
    {
      day = "Thr";
    }
    else if(dnum == 5)
    {
      day = "Fri";
    }
    else if(dnum == 6)
    {
      day = "Sat";
    }
    return day;
    
  }
  
  
  /** * F. Calculate and return the day by adding certain days to the current * day. */
  
  public String addDays(int days)
    
  {
    dnum = (dnum + days) % 7;
    if(dnum == 0)
    {
      day = "Sun";
    }
    else if(dnum == 1)
    {
      day = "Mon";
    }
    else if(dnum == 2)
    {
      day = "Tue";
    }
    else if(dnum == 3)
    {
      day = "Wed";
    }
    else if(dnum == 4)
    {
      day = "Thr";
    }
    else if(dnum == 5)
    {
      day = "Fri";
    }
    else if(dnum == 6)
    {
      day = "Sat";
    }
    return day;
    
    
  }
}