import java.lang.*;
public class Cylinder extends Circle
{
  double height;
  public Cylinder()
  {
    super();
    height = 0;
  }
  public Cylinder(int x, int y, double r, double h)
  {
    super(x,y,r);
    height = r;
  }
   public void setCylinder(int x, int y,  double r, double h)
  {
    super.setCircle(x,y,r);
    height = h;
  }
  public double getHeight()
  {
    return height;
  }
  public void printCylinder()
  {
    super.printCircle();
    System.out.println("\nHeight: "+height);
  }
  public void makeCopy(Cylinder otherCylinder)
  {
    super.makeCopy(otherCylinder);
    height = otherCylinder.height;
  }
  
  public Cylinder getCopy()
  {
    Cylinder temp = new Cylinder();
    super.getCopy();
    
    temp.height = height;
    
    return temp;
  }
  public double Volume(double r,double h)
  {
    double volume;
    volume = h*super.Area(r);
    
    return volume;
  }
  public double sArea(double h, double r)
  {
    double sarea;
    
    sarea = 2*Math.PI*r*h + 2*Math.PI*(r*r);
    return sarea;
  }
   public boolean equals(Cylinder otherCylinder)
    {
        return (super.equals(otherCylinder) && height == otherCylinder.height);
    }
}
