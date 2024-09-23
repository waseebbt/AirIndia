public class Task2{
public static void main(String args[])
{
 int a[]={10,20,10,30,40,40,50,20};
int count;
for(int i=0;i<a.length;i++)
{
 count=1;
  for(int j=i+1;j<a.length;j++)
 {
 if(a[i]==a[j] && a[i]!=0)
   {
      count++;
       a[j]=0;
   }
 }
 if(count ==1 && a[i]!=0)
{
 System.out.print(a[i]);
}
}
}
}

 

 