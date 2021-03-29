class PerimeterDemo
{
public static void main(String a[])
{
 int radius=Integer.parseInt(a[0]);
double Area=Math.PI*radius*radius;
double Perimeter=2*Math.PI*radius;
System.out.println("area of the circle="+Area);
System.out.println("perimeter of the circle="+Perimeter);
if(radius<=0)
{
System.out.println(" please enter non zero positive number");
}
}
}