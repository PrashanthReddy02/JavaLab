

package Javalab;

import java.util.*;

public class Pyramid {

public static void main(String[] args)

{

Scanner sc = new Scanner(System.in);

System.out.print("ENTER THE NUMBER OF LEVELS OF PYRAMID: ");

int levels= sc.nextInt();

printPyramid(levels);

}

public static void printPyramid(int levels)

{

int numSpaces=levels-1;

int numStars=1;

for(int i=0; i<levels; i++)

{

for(int j=0; j<numSpaces; j++)

{

System.out.print(" ");

}

for(int k=0;k<numStars;k++)

{

System.out.print("*");

}

System.out.println();

numSpaces--;

numStars+=2;

}

}

}
