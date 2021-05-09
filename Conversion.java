import java.util.*;

class Conversion
{
public static void main(String[] args)
{ Scanner sc=new Scanner(System.in);
  System.out.println("enter a binary: ");
 String B=sc.next();
  int I  =Integer.parseInt(B,2);
  System.out.println("decimal no : "+I);
  String O= Integer.toOctalString(I);
  System.out.println("Octol no : "+I);
  String H=Integer.toHexString(I);
  System.out.println("Hexadecimal no : "+I);

}}