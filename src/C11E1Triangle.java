import java.util.Scanner;


class GeometricObject
{
    private String TColor="Yellow";
    private boolean isfilled=true;
    public String getcolor()
    {
        return TColor;
    }
    public void putcolor(String c)
    {
        this.TColor=c;
    }
    public boolean isFilled()
    {
        return isfilled;
    }
}

public class C11E1Triangle  extends GeometricObject
{private double side1;
private double side2;
private double side3;
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

int ch = -1;
System.out.println("Enter choice");
System.out.println("press non zero number to find the area of triangle");
System.out.println("press 0 to exit");

ch = input.nextInt();
while(ch!=0){
	
try
	{
		System.out.println("enter the sides for the triangle");
	           double s1 = input.nextDouble();
	           double s2 = input.nextDouble();
	           double s3 = input.nextDouble();
			
			C11E1Triangle tt = new C11E1Triangle(s1,s2,s3);

    System.out.println("Sides of Triangle are ----> "+tt.toString());
    System.out.println("Area of Triangle is   ---->    "+tt.getarea());
    System.out.println("Perimeter of Triangle is ----> "+tt.getperimeter());
    System.out.println("color of Triangle is ---->  "+tt.getcolor());
    System.out.println("is triangle filled? true/false? ---->  "+tt.isFilled());

}
catch(IllegalArgumentException e){
	System.out.println(e);
	}
}}
public C11E1Triangle()
{
}
public C11E1Triangle(double s1, double s2, double s3) throws IllegalArgumentException{
{
    side1=s1;
    side2=s2;
    side3=s3;
    
    
    if(s1 + s2 >s3 && s2 + s3>s1 && s1 + s3 > s2){
		 side1=s1;
		    side2=s2;
		    side3=s3;
	}
	else
	throw new IllegalArgumentException("sum of two sides has to be greater then third side");
}
}
public double getside1()
{
    return side1;
}
public double getside2()
{
    return side2;
} 
public double getside3()
{
    return side3;
}   
public double getarea()
{
    double s=(side1+side2+side3)/2;
    double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    return area;
}
public double getperimeter()
{
    return (side1+side2+side3);
}
public String toString()
{
    return "Triangle: side1= "+side1+" side2= "+side2+" side3=" +side3;
}
}

