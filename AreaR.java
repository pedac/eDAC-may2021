import java.util.*;
class AreaR
{
 public static void main(String[] args)
{ Scanner sc= new Scanner(System.in);
System.out.println("enter Length and Breadth: ");
double D1= sc.nextDouble();
double D2= sc.nextDouble();
double d1=D1*D2;
double d2=2*(D1+D2);
System.out.println("Area : "+d1);
System.out.println("perimeter is : "+d2);
}
}