import java.util.*;
public class codeLoops1
{
 public static void main(String [] args)
 {
  Scanner kb =new Scanner(System.in);
    System.out.println("Please Enter Lungelo's Age: ");
    int Lungelo=kb.nextInt();
    System.out.println("Please Enter Sya's Age: ");
    int Sya=kb.nextInt();
    System.out.println("Please Enter Sanele's Age: ");
    int Sanele=kb.nextInt();
    
    if (Lungelo> Sya && Lungelo > Sanele )
    {
     System.out.println("Lungelo is older");
     }
    else if (Lungelo < Sya && Lungelo < Sanele) 
     { 
      System.out.println("Lungelo is smaller");
      }
    else 
    {
     System.out.println("Lungelo is medium");
    }
  
      if (Sanele > Sya && Sanele > Lungelo)
      {
      System.out.println("Sanele is older");
      }
      else if (Sanele < Sya && Sanele < Lungelo)
      {
      System.out.println("Sanele is Smaller");
      }
      else
      {
      System.out.println("Sanele is medium");
      }
      
      if (Sya > Sanele && Sya > Lungelo)
      {
      System.out.println("Sya is older");
      }
      else if (Sya < Sanele && Sya < Lungelo)
      {
      System.out.println("Sya is Smaller");
      }
      else
      {
      System.out.println("Sya is medium");
       }
     
  
}}