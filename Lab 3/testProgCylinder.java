import java.util.*;

public class testProgCylinder
{
  static Scanner console = new Scanner(System.in);
  public static void main(String[] args)
  {
    Cylinder A = new Cylinder(5, 4, 30,7);
    Cylinder B = new Cylinder();
    
    int x;
    int y;
    double r;
    double h;
    
    System.out.print("Line 6: A");
    A.printCylinder();
    System.out.println();
    
    System.out.print("Line 9,");
    B.printCylinder();
    System.out.println();
    
    B.setCylinder(5, 45, 16,8);
    
    System.out.print("Line 13: After setting " + "the B: ");
    B.printCylinder();
    System.out.println();
    
    if(A.equals(B))
      System.out.println("Line 17: Both the" + "times are equal");
    else
      System.out.println("Line 19: The two" + "times are not" + "equal.");
    
    System.out.print("Line 20: Enter cylinder ");
    
    x = console.nextInt();
    y = console.nextInt();
    r = console.nextInt();
    h = console.nextInt();
    
    System.out.println();
    
    A.setCylinder(x,y,r,h);
    
    System.out.print("line 26: New time of " + "A: ");
    A.printCylinder();
    System.out.println();
    
  
    System.out.println();
    
    B.makeCopy(A);
    System.out.println("Line 34: After copying " + "A into B," + "B: ");
    
    B.printCylinder();
    System.out.println();
    System.out.println("Area, A "+A.sArea(5,7));
    System.out.println("Circumference, A "+A.Volume(5,7));
  }
}
    
    
    
