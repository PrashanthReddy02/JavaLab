package Javalab;

import java.util.Date;
import java.util.Stack;

public class Employid {

public static void main(String[] args) {
   System.out.println("Enter valid employee ID:\n");
   int[]EmplId= {1001, 1002, 1003, 1004, 1005, 1006, 1007};
   String[]Empname= {"ABC","opqr","Ghi","wxyz","jklm","Stuv","Def"};
   String[]Joindate= {"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/06/2003"};
   char[]DesignCode= {'e','c','k','r','m','e','c'};
   String[]Department= {"R&D", "PM","Acct","Front Desk","Engg","Manufacturing","PM"};
   double[]Basic= { 20000, 30000, 10000, 12000, 50000, 23000, 29000};
   double[]HRA = { 8000, 12000, 8000, 6000, 20000, 9000, 12000};
   double[]IT = {3000, 9000, 1000, 2000, 20000, 4400, 10000};
   char[]DesignationCode= {'e','c','k','r','m'};
   String[]Designation= { "Engineer", "Consultant", "Clerk", "Receptionist", "manager"};
   double[]DA= {20000, 32000, 12000, 15000, 40000};
   
   int flag=0;
   int id=Integer.parseInt(args[0]);
   
   for(int i=0;i<EmplId.length;i++) {
    if(EmplId[i]==id)
    {
    flag=1;
    System.out.println("Emp id. Emp name  DepartmentDesignation DA");
    System.out.println(EmplId[i]+" "+Empname[i]+" "+Department[i]);
   
    for(int j=0; j<DesignationCode.length;j++) {
    if(DesignationCode[i]==DesignationCode[j])
    {
    System.out.print(""+Designation[j]+"");
    double sum=Basic[i]+HRA[i]+DA[j]-IT[i];
    System.out.print(sum);
    }
    }
    }
   }
   if(flag==0)
    System.out.println("there is no employee with empid: "+id);
   
   
   }
}
