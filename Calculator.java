package Javalab;

import java.util.*;

public class Calculator {

public static void main(String[] args) {

int op1,op2;

int optr,result;

System.out.println("1.Addition \t2.Subtractor \t3.Multiplication \t4.Division \t Enter the operator: ");

Scanner sc =new Scanner(System.in);

optr=sc.nextInt();

System.out.println("Enter the first operand");

op1=sc.nextInt();

System.out.println("Enter the second operand");

op2=sc.nextInt();

switch(optr)

{

case 1: result=op1+op2;

System.out.println("Addition="+result);

break;	

case 2: result=op1-op2;

System.out.println("Subtraction="+result);

break;

case 3: result=op1*op2;

System.out.println("Multiplication="+result);

break;

case 4:if(op2==0)

System.out.println("operand cannot be 0");

else

{

result=op1/op2;

System.out.println("Division="+result);

}

break;

}

}
