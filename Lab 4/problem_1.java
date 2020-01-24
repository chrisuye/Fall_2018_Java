import java.util.*;
public class problem_1
{
  public static void main(String[] args)
  {
    Scanner cin = new Scanner(System.in);
    String word;
    int num = 0;
    
    System.out.print("Enter word");
    word = cin.nextLine();
    
    backward(word,num);
  }
  
  public static void backward(String word, int n)
  {
    int length = word.length();
    
    if (n == length-1)
    {
      System.out.print(word.charAt(n));
    }
    
    else
    {
      backward(word,n+1);
      System.out.print(word.charAt(n));        
    }
  }
}