class DiviDemo
{
public static void main(String a[])
{
int n=Integer.parseInt(a[0]);
int sum=0;
for(int i=0;i<=n;i++)
{
if(i%3==0)
{
sum =sum+i;
}
}
System.out.println("Sum="+sum);
}
}