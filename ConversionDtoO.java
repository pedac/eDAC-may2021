import java.util.*;
class ConversionDtoO

 {
 public static void main(String[] args)
 {  
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a Decimal: ");
   int a =sc.nextInt();
   String O=Integer.toOctalString(a);
   System.out.println("Octal is : "+O);
 
 
 
 }
 }