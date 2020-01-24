import java.lang.*;
public class Circle extends Point
{
  
  double rad;
  public Circle()
  {
    super();
    rad = 0;
  }
  public Circle(int x, int y, double r)
  {
    super(x,y);
    rad = r;
  }
  public void setCircle(int x, int y,  double r)
  {
    super.setPoint(x,y);
    rad = r;
  }
  public double getrad()
  {
    return rad;
  }
  public void printCircle()
  {
    super.printPoint();
    System.out.println("Rad: "+rad);
  }
  public void makeCopy(Circle otherCircle)
  {
    super.makeCopy(otherCircle);
    rad = otherCircle.rad;
  }
  
  public Circle getCopy()
  {
    Circle temp = new Circle();
    super.getCopy();
    
    temp.rad = rad;
    
    return temp;
  }
  public double Area(double r)
  {
    double area;
    
    area = Math.PI*((double)r*(double)r);
    return area;
  }
  public double Circumference(double r)
  {
    double area;
    
    area = Math.PI*(2*(double)r);
    return area;
  }
   public boolean equals(Circle otherCircle)
    {
        return (super.equals(otherCircle) && rad == otherCircle.rad);
    }
}