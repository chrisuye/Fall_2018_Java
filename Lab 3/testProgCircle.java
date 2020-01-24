import java.util.*;

public class testProgCircle
{
  static Scanner console = new Scanner(System.in);
  public static void main(String[] args)
  {
    Circle A = new Circle(5, 4, 30);
    Circle B = new Circle();
    
    int x;
    int y;
    double r;
    
    System.out.print("Line 6: A");
    A.printCircle();
    System.out.println();
    
    System.out.print("Line 9,");
    B.printCircle();
    System.out.println();
    
    B.setCircle(5, 45, 16);
    
    System.out.print("Line 13: After setting " + "the B: ");
    B.printCircle();
    System.out.println();
    
    if(A.equals(B))
      System.out.println("Line 17: Both the" + "times are equal");
    else
      System.out.println("Line 19: The two" + "times are not" + "equal.");
    
    System.out.print("Line 20: Enter circle ");
    
    x = console.nextInt();
    y = console.nextInt();
    r = console.nextInt();
    
    System.out.println();
    
    A.setCircle(x,y,r);
    
    System.out.print("line 26: New time of " + "A: ");
    A.printCircle();
    System.out.println();
    
  
    System.out.println();
    
    B.makeCopy(A);
    System.out.print("Line 34: After copying " + "A into B," + "B: ");
    
    B.printCircle();
    System.out.println();
    System.out.println("Area, A "+A.Area(5));
    System.out.println("Circumference, A "+A.Circumference(5));
  }
}
    
    
    
