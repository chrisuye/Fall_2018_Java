import java.util.Scanner;

public class problem_2
{
  
  public static void printPatternU(int n)
    
  {
    
    if(n==0) return;
    
    System.out.print("*");
    
    printPatternU(n-1);
    
  }
  
  public static void printPattern(int n)
    
  {
    
    for(int i=n;i>=1;i--)
      
    {
      
      printPatternU(i);
      
      System.out.println();
      
    }
    
    for(int i=1;i<=5;i++)
      
    {
      
      printPatternU(i);
      
      System.out.println();
      
    }
    
  }
  
  public static void main(String[] args)
    
  {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number of rows : ");
    
    int n = sc.nextInt();
    
    printPattern(n);
    
  }
  
}