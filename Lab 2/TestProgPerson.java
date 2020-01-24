//Christian Seyoum
//10/3/2018
//Problem 4
public class TestProgPerson
{
  
  public static void main (String[] args)
    
  {
  
    Person p1 = new Person("Tim","J.","Hawkins");
    
    Person p2 = new Person();
    
    p2.makeCopy(p1);
    
    if(p1.equals(p2) == true)
    {
      System.out.println("Both persons are same .");
    }
    else
    {
      System.out.println("Persons are different .");
    }
    System.out.println(p2);
   
    p2.setfirst("Tim");
    p2.setmiddle("T");
    p2.setlast("last");
    if(p1.equalsFirstName(p2) == true)
    {
      System.out.println("Both person's first name are same.");
    }
    else
    {
      System.out.println("Person's first name are different.");
    }
    
    if(p1.equalsMiddleName(p2) == true)
    {
      System.out.println("Both person's middle name are same.");
    }
    else
    {
      System.out.println("Person's middle name are different.");
    }
    
    if(p1.equalsLastName(p2) == true)
    {
      System.out.println("Both person's last name are same.");
    }
    else
    {
      System.out.println("Person's last name are different.");
    }
    
    p2.getCopy(p1);
    
    System.out.println(p2.getCopy(p1));
  }
  
}