import java.util.Scanner;
public class Reverseno
{
   public static void main(String[] args)
   {
       int num, reverse=0;

       System.out.print("Enter the number which u want to reverse:");
       Scanner sc= new Scanner(System.in);
       num= sc.nextInt();

       for( ;num != 0; num=num/10)
       {
           int remainder = num % 10;
           reverse = reverse * 10 + remainder;
       }
       System.out.println("The reverse of the given number is: " + reverse);

   }
}

