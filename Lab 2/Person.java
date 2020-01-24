public class Person
{
  private String firstName; //store the first name
  private String lastName;  //store the last name
  private String middleName;//store the middle name
  
  //Default constructor
  //Initialize firstName and lastName and middleName to an empty string.
  //Postcondition: firstName = ""; lastName = ""; middleName = "";
  public Person()
  {
    firstName = "";
    lastName = "";
    middleName = "";
    
  }
  
  
  //Constructor with parameters
  //Set firstName and lastName according to the parameters.
  //Postcondition: firstName = first; lastName = last;
  public Person(String first, String last, String middle)
  {
    setName(first, last, middle);
  }
  
  //method set last name
  public void setlast(String last)
  {
    lastName = last;
  }
  //method set last name
  public void setfirst(String first)
  {
    firstName = first;
  }
  //method set middle name
  public void setmiddle(String middle)
  {
    middleName = middle;
  }
  // method is used to set the correct format for name
  public String toString()
  {
    return (firstName + " " + lastName + " " + middleName);
  }
  
  //Method to set firstName and lastName according to
  //the parameters.
  //Postcondition: firstName = first; lastName = last;
  public void setName(String first, String last, String middle)
  {
    firstName = first;
    lastName = last;
    middleName = middle;
  }
  // method check if last name is equal
  public boolean equalsLastName(Person p)
    
  {
    
    if(this.lastName == p.lastName)
      
      return true;
    
    else
      
      return false;
    
  }
  // method checks if middle name is equal
  public boolean equalsMiddleName(Person p)
    
  {
    
    if(this.middleName == p.middleName)
      
      return true;
    
    else
      
      return false;
    
  }
  // method checks if first name is equal
  public boolean equalsFirstName(Person p)
    
  {
    
    if(this.firstName == p.firstName)
      
      return true;
    
    else
      
      return false;
    
  }
  // method checks if the full names are the same
  public boolean equals(Person p)
    
  {
    
    if(this.lastName == p.lastName && this.firstName == p.firstName)
      
      return true;
    
    else
      
      return false;
    
  }
  //method makes a copy and replaces the name of another
  public void makeCopy(Person p)
    
  {
    
    this.firstName = p.firstName;
    
    this.middleName = p.middleName;
    
    this.lastName = p.lastName;
    
  }
  //method makes copy of address and sends it to the other name
  public Person getCopy(Person p)
    
  {
    
    Person p1 = new Person();
    
    p1.firstName = p.firstName;
    
    p1.middleName = p.middleName;
    
    p1.lastName = p.lastName;
    
    return p1;
    
  }
  
  //Method to return firstName.
  //Postcondition: The value of firstName is returned.
  public String getFirstName()
  {
    return firstName;
  }
  
  //Method to return lastName.
  //Postcondition: The value of lastName is returned.
  public String getLastName()
  {
    return lastName;
  }
  //Method to return middlename.
  //Postcondition: The value of lastName is returned.
  public String getMiddleName()
  {
    return middleName;
  }
}