/* christian seyoum
 * 8/30/2018
 */
import java.util.*;
public class Problem_3
{
  public static void main(String[] args)
  {
    int iNum1;
    int iNum2;
    int iSum;
    Scanner cin = new Scanner(System.in);
    System.out.print("Enter Num1: ");
    iNum1 = cin.nextInt();
    System.out.print("Enter Num2: ");
    iNum2 = cin.nextInt();
    iSum = 0;
    while (iNum1<iNum2)
    {
      iNum2--;
      if (iNum2%2 == 0)
      {
        iSum = iNum2 + iSum;
      }
      else
      {
        System.out.println(iNum2);
      }
    }
    System.out.println("Sum of all even numbers between num1 and num2: "+iSum);
  }
}