import java.util.*;
 class TestQ9
{
  public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter values:  ");

double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double d=sc.nextDouble();
double e=((a*b-b*b)/(c-d));
System.out.println("expected output is: "+e);
}
}