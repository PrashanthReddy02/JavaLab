

package Javalab;

import java.util.*;

public class lexicography {

public static void main(String[] args) {

String [] words= {"Salvatore", "Mikaelson", "Chandler", "Joey", "Ross", "Bunny"};

for(int i=0;i<6;++i)

{

for(int j=1+i;j<6;++j)

{

if(words[i].compareTo(words[j])>0)

{

String temp=words[i];

words[i]=words[j];

words[j]=temp;

}

}

}

System.out.println("Lexicographical order: ");

for(int i=0;i<6;i++)

{

System.out.println(words[i]);

}

}

}
