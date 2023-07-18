

package Javalab;

import java.util.*;

public class Uniquepass {

public static void main(String [] args) {

String name;

int room_no;

long ph_no;

Scanner sc =new Scanner(System.in);

System.out.println("Enter your name: ");

name=sc.nextLine();

System.out.println("Enter your room no:");

room_no=sc.nextInt();

System.out.println("Enter your phone no:");

ph_no=sc.nextLong();

int sum=0;

char []sym= {')','!','@','#','$','*','&',')'};

do

{

while(room_no!=0)

{

int rem=room_no%10;

sum=sum+rem;

room_no=room_no/10;

}

if(sum>=10)

{

room_no=sum;

sum=0;

}

}

while(room_no!=0);

int c=room_no/100;

int len =name.length();

int pos=0;

for(int i=0;i<len;i++)

{

if(c==i)

{

pos=i;

System.out.println("password is :");

}

}

String pw=""+name.charAt(0)+(ph_no%100)+sum+sym[c]+name.charAt(len-1);

System.out.println(pw);

}

}
