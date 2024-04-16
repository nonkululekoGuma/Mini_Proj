import java.util.*;
public class Arrays_2022_Search
{
     public static void main(String[]args)
     {
     Scanner keyboard = new Scanner(System.in);
     int [] marklist = {50,70,20,80,45,56,78,100,89};
     boolean found = false;
     System.out.println("Enter the search value");
     int searchValue = keyboard.nextInt();
     
     for(int i=0; i<marklist.length;i++)
     {
     //This if statement will execute results only if the condition evaluates to true and when its false it won't print anything.
      if(marklist[i] == searchValue)
         {
         found = true;
         System.out.println("The value has been found at position "+i);             
         
         }
                     
     
     }
     
     //Outside the for loop
     if(found == false)
     {     
     System.out.println("The value was not found");
     
     System.out.println(marklist.length);
     }
     
     }
     
}
