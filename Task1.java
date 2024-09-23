public class Task1{
public static  void  main(String args[])
{
int a[]={1,2,3,4,5};
int n=3;
System.out.println("Original Array:");
for(int i=0;i<a.length;i++)
{
 System.out.println(a[i]+" ");
}
for(int i=0;i<n;i++)
{
 int j,first;
first=a[0];
for(j=0;j<a.length-1;j++)
{
 a[j]=a[j+1];
}
 a[j] = first;
}
System.out.println();
System.out.print("Array after rotation for left:");
for(int i=0;i<a.length;i++)
{

System.out.print(a[i]+" ");
}
}
}