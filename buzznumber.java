

package Javalab;

import java.util.*;

interface A{

public void buzz();

}

interface B{

public void frequ();

}

public class inherit implements A,B{

public void buzz() {

int n;

Scanner sc=new Scanner(System.in);

System.out.println("Enter a number");

n=sc.nextInt();

int d=n%10;

if(n%7==0 || d==7) {

System.out.println("Buzz number");

}

else {

System.out.println("Not a Buzz number");

}

}

public void frequ(){

int n;

Scanner sc = new Scanner(System.in);

System.out.println("Enter value of n:");

n = sc.nextInt();

int num[] = new int[n];

int freq[] = new int[n];

int flag[] = new int[n];

System.out.println("Enter "+n+" numbers:");

for(int i=0;i<n;i++)

{

num[i] = sc.nextInt();

}

for(int i=0;i<n;i++)

{

freq[i]=0;

for(int j=0;j<n;j++)

{

if(num[i]==num[j])

{

freq[i]++;

}	

}	

}

for(int i=0;i<n;i++)

{

for(int j=0;j<i;j++)

{

if(num[i]==num[j])

flag[i]++;

}

}

for(int i=0;i<n;i++)

{

if(flag[i]!=0&&freq[i]>1)

{

System.out.println("Frequency of "+num[i]+" is "+ freq[i]);

}

}

}

public static void main(String[] args) {

inherit obj = new inherit();

obj.buzz();

obj.frequ();

}

}
