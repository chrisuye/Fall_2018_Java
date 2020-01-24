/* christian seyoum
 * 8/30/2018
 */
import java.util.*;
public class Problem_1
{
  public static void main(String[] args)
  {
    double dLength;
    double dWidth;
    double dArea;
    Scanner cin = new Scanner(System.in);
    System.out.print("Enter length: ");
    dLength = cin.nextDouble();
    System.out.print("Enter width: ");
    dWidth = cin.nextDouble();
    dArea = dLength * dWidth;
    System.out.println("Area= "+dArea);
  }
}