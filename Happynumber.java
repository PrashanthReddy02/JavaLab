

package Javalab;

import java.util.*;

interface Number

{

interface Happy_num

{

public void checkHappy();

}

}

public class Happy implements Number{

public void checkHappy()

{

int num;

Scanner scan=new Scanner(System.in);

System.out.println("Enter a non-zero positive number:");

num=scan.nextInt();

int temp=num,rem,sum=0;

do

{

while(temp!=0)

{

rem=temp%10;

sum=sum+(rem*rem);

temp=temp/10;

}

temp=sum;

sum=0;

}while(temp>9);

if(temp==1)

{

System.out.println(num+" is a Happy Number");

}

else

{

System.out.println(num+" is not a Happy Number");

}

}

public static void main(String[] args) {

Happy obj=new Happy();

obj.checkHappy();

}

}
