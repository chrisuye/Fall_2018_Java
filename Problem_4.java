/* christian seyoum
 * 8/30/2018
 */
import java.lang.*;
public class Problem_4
{
  public static void main(String[] args)
  {
    double dP = 1000.0;
    double dA;
    double dR = .03;
    double dI;
    double dF;
    for (int iT = 1; iT <= 10; iT++)
    {
      System.out.println("For year: "+iT);
      System.out.println("Current balance: "+dP);
      dF = Math.pow((1+(dR/(double)iT)),(double)iT);
      dA = dP *dF;
      dI = dA-dP;
      System.out.println("interest: "+dI);
      dP = dA;
      dP = dP+200.0;      
      System.out.println("New deposit: 200");
      System.out.println("New balance: "+dP);
    }
  }
}