/*Christian Seyoum
 * 9/14/2018
 */
import java.lang.*;
public class Problem_3
{
  public static void main(String[] args)
  {
    String sDate;
    String sMonth;
    String sDay;
    String sYear;
    
    sDate = "September 6, 2018";

    //System.out.print(sDate);
    
   sMonth = sDate.substring(0,sDate.indexOf(" "));
   sDay = sDate.substring(sDate.indexOf(" ")+1,sDate.indexOf(","));
   sYear = sDate.substring(sDate.indexOf(",")+2,sDate.length());
   System.out.print(sYear+"-"+sMonth+"-"+sDay);
  }
}