import java.util.*;
class ConversionDtoH

 {
 public static void main(String[] args)
 {  
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a Decimal: ");
   int a =sc.nextInt();
   String H=Integer.toHexString(a);
   System.out.println("Binary is : "+H);
 
 
 
 }
 }