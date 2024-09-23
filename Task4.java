public class Task4
{
 public static String remconsdup(String str)
{
 if(str == null || str.length() == 0)
{
  return   "";
}
StringBuilder sb = new StringBuilder();
char prevChar = str.charAt(0);
sb.append(prevChar);
for(int i=0;i<str.length();i++)
{
 char currChar=str.charAt(i);
if(currChar != prevChar)
{
 sb.append(currChar);
 prevChar = currChar;
}
}
return sb.toString();
}

public static void main(String args[])
{
 String is="aaabbccddca";
String os= remconsdup(is);
System.out.println(os);
}
}