import java.util.Scanner;
public class Naturalnumber
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in); //scanner variable declare
       System.out.println("Please enter any natural number:"); //Scanner through number enter
       int i;
       int sum=0;
       int num= sc.nextInt();
       for(i=1;i<=num;++i)
       {
           sum= sum+i;
       }
       //print the sum
        System.out.println("The sum of Natural number is=" + sum);
    }
}

