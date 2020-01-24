import java.util.*;

public class testProgClock
{
  static Scanner console = new Scanner(System.in);
  public static void main(String[] args)
  {
    ExtClock A = new ExtClock(5, 4, 30,5);
    ExtClock B = new ExtClock();
    
    int hours;
    int minutes;
    int seconds;
    int zone;
    
    System.out.print("Line 6: myClock: ");
    A.printTime();
    System.out.println();
    
    System.out.print("Line 9, yourClock: ");
    B.printTime();
    System.out.println();
    
    B.setTime(5, 45, 16);
    
    System.out.print("Line 13: After setting " + "the time, yourClock: ");
    B.printTime();
    System.out.println();
    
    if(A.equals(B))
      System.out.println("Line 17: Both the" + "times are equal");
    else
      System.out.println("Line 19: The two" + "times are not" + "equal.");
    
    System.out.print("Line 20: Enter the hours, ");
    
    hours = console.nextInt();
    minutes = console.nextInt();
    seconds = console.nextInt();
    
    System.out.println();
    
    A.setTime(hours, minutes, seconds);
    
    System.out.print("Enter time zone: ");
    zone = console.nextInt();
    B.setZone(zone);
    
    System.out.print("line 26: New time of " + "A: ");
    A.printTime();
    System.out.println();
    
    A.incrementSeconds();
    
    System.out.print("Line 30: After increase the time by second, A is: ");
    A.printTime();
    System.out.println();
    
    B.makeCopy(A);
    System.out.print("Line 34: After copying " + "A into B," + "B: ");
    
    B.printTime();
    System.out.println();
  }
}
    
    
    
