class Average
{ 
public static void main(String a[])
{

int i,n=5;
double sum=0,average,highest=0;
double marks[]= new double[n];
marks[0]=10;marks[1]=20;marks[2]=30;marks[3]=40;marks[4]=50;
for(i=0;i<n;i++)
{
sum=sum+marks[i];
if(marks[i]>highest)
highest=marks[i];
}
average=sum/n;
System.out.println("Average="+average);
System.out.println("Highest="+highest);
}
}