import java.util.*;
public class codeLoops2
{
 public static void main(String [] args)
 {
  Scanner kb =new Scanner(System.in);
  int max=0;
  int index=0;
  int [] marks= {58,42,70,90};
  String[] module={"TP","SS","IS","DS"};
  
  for(int i=0; i<4; i++)
   if (marks[i] > max)
   {
    max=marks[i];
    index=i;
   }
 System.out.println("The highest is:"+max+" in index " +module[index]);    
  
}}  