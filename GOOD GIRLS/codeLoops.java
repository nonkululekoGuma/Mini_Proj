//Nonkulueko 22049407 
import java.util.*;
public class codeLoops
{
 public static void main(String [] args)
 {
  Scanner kb =new Scanner(System.in);
  System.out.println("Please Enter your Name: ");
  String name=kb.next();
  System.out.println("Please Enter your monthly salary: ");
  double MSalary=kb.nextDouble();
//Declaration 
  double tax=0.1;
  double fixedPay=540;
  double AnnualAmt=0.08;
  double TDeduction=0;
  double NetPay=0;
  double AnnualNet=0;
  double Unemployment=0;
//Calculation 
  double MonthlyTax=MSalary * tax;
  Unemployment=MSalary * 0.08;
  TDeduction=MonthlyTax + Unemployment + fixedPay;
  NetPay=MSalary - TDeduction;
  AnnualNet=NetPay * 12;
  
  System.out.println("The Employee's name is: "+name);
  System.out.println("The Total Deductions for Employee: "+ TDeduction);
  System.out.println("The Monthly Net pay of the employee: "+ NetPay);
  System.out.println("The employee's Annual net pay: "+AnnualNet);
}}
  
  
  
  
  
  