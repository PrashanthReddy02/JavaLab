package Javalab;

import java.util.*;

public class Matrix {

public void sum(int[][]a,int[][]b,int r,int c)

{

int d[][]=new int[r][c];

for(int i=0;i<=r;i++)

{

for(int j=0;j<c;j++)

{

d[i][j]=a[i][j]+b[i][j];

}

}

System.out.print("Matrix after addition is");

for(int i=0;i<=r;i++)

{

for(int j=0;j<c;j++)

{

System.out.print(d[i][j]+"\t");

}

System.out.print("\n");

}

}

public static void main(String[] args)

{

int rows, columns;

Scanner obj=new Scanner(System.in);

System.out.print("\n Enter the rows of matrix");

rows=obj.nextInt();

System.out.println("\n Enter the columns of matrix");

columns=obj.nextInt();

int array1[][]=new int[rows][columns];

int array2[][]=new int[rows][columns];

System.out.println("Enter array 1 elements");

for(int i=0;i<rows;i++)

{

for(int j=0;j<columns;j++)

{

array1[i][j]=obj.nextInt();

}

}

System.out.println("Enter array 2 elements");

for(int i=0;i<rows;i++)

{

for(int j=0;j<columns;j++)

{

array2[i][j]=obj.nextInt();

}

}

Matrix add=new Matrix();

add.sum(array1 ,array2, rows, columns);

}

}
