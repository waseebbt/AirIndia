  import java.util.Scanner;
public class Task3{
 public static void main(String args[])
 {
    int i,j;
   String temp;
Scanner sc = new Scanner (System.in);
System.out.println("Enter the size of an Array:");
int n=sc.nextInt();
String a[]=new String[n];
System.out.println("Enter the value of an Array:");
 for(i=0;i<a.length;i++)
  {
     a[i]=sc.nextLine();
  }
System.out.println("After shorting:");
for(i=0;i<a.length;i++)
{
 for(j=i+1;j<a.length;j++)
{
 if(a[i].compareTo (a[j]) <0)
  {
    temp=a[i];
    a[i]=a[j];
    a[j]=temp;
  }
}
System.out.println(a[i]);
}
}
}