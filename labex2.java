import java.util.*;
class labex2
{
 public static void main(String args[])
 {
     System.out.println("Enter the choice");
     Scanner c=new Scanner(System.in);
     String s=c.next();
     switch(s)
     {
         
         case "red":
         System.out.println("stop");
         break;
         case "yellow":
         System.out.println("ready");
         break;
         case "green":
         System.out.println("gore");
         break;
         
     }
 }   
}