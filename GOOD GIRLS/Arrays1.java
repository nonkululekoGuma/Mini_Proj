import java.util.*;
public class Arrays1
{
     public static void main(String[]args)
     {
     int sum =0;
     int replace=0;
     Scanner keyboard = new Scanner(System.in);
     int [] Numbers = {100,125,120,0,4,10,9,20};
     
     for(int i=0; i<Numbers.length; i++)
     {
      sum=Numbers[i] + 5;
      System.out.println("The sum is: "+sum);
       if (sum % 2==0)
        Numbers[i]=0;
        replace=Numbers[i];
        System.out.println(replace);
                
      if(sum % 3==0)
      System.out.println(Numbers[i]);
      }
      
   }
}