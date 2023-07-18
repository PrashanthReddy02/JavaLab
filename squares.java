

package Javalab;

import java.util.*;

public class Squares

{

public static void main(String[] args)

{

Scanner obj=new Scanner(System.in);

System.out.print("Enter the size of square matrixNo:");

int n=obj.nextInt();

int totalsquares= calculatetotalsquares(n);

System.out.println("Total number of squares in the square matrix:"+totalsquares);

}

private static int calculatetotalsquares(int n)

{

int total=0;

for(int i=1;i<=n;i++)

{

total+=(n-i+1)*(n-i+1);

}

return total;

}

}
