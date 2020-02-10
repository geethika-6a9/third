package com.calculator.democal;
import java.util.Scanner;
public class App {
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter  two numbers: ");
 double first=sc.nextDouble();
 double last=sc.nextDouble();
 System.out.println("Enter an operator (+, -, *, /): ");
 char operator=sc.next().charAt(0);
 if(operator=='+')
 {
 add(first,last);
 }
 else if(operator=='-')
 {
 sub(first,last);
 }
 else if(operator=='*')
 {
 mul(first,last);
 }
 else if(operator=='/')
 {
 div(first,last);
 }
 else
 {
 System.out.println("Invalid input check the operator you have entered");
 }
 }
public static void add(double a,double b)
{
double c;
c=a+b;
System.out.println("addition of two values is "+c);
}
public static void sub(double a,double b)
{
double c;
c=a-b;
System.out.println("Subtraction of two values is "+c);
}
public static void mul(double a,double b)
{
double c;
c=a*b;
System.out.println("Multiplication of two values is "+c);
}
public static void div(double a,double b)
{
if(b==0)
{
System.out.println("Second value is 0 ,Division can not possible");
}
else
{
double c;
c=a/b;
System.out.println("Division of two values is "+c);
}
}
}

   
