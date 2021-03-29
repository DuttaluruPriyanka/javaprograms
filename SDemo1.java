class Overriding
{ 
void  area(int S)
{
System.out.println("area of square:"+(S*S));
}
}
class SDemo1 
{
public static void main(String args[])
{ 
Overriding S=new Overriding();
S.area(10);
}
}