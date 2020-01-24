/*Christian Seyoum
 * 9/14/2018
 */
import java.util.*;

public class Problem_4
{
  public static void main(String[] args)
  {
    double dGrade;
    
    Scanner cin = new Scanner(System.in);
    do
    {
    System.out.print("Enter your Score, 0 to 100: ");
    dGrade = cin.nextInt();
    }while(dGrade < 0 || dGrade > 100);
    System.out.print("Grade "+getGrade(dGrade));
  }
  
  public static double getGrade(double fdGrade)
  {
    double dGrade;
    double dTemp;
    if (fdGrade >= 95.0)
    {
      dGrade = 4.0;
    }
    else if ( fdGrade < 60)
    {
      dGrade = 0.0;
    }
    else
    {
      dTemp = 95-fdGrade;
      dTemp = dTemp/10;
      dGrade = 4.0 - dTemp;
    }
    
    return dGrade;
  }
}
 