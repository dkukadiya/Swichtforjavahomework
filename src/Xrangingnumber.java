import java.util.Scanner;
public class Xrangingnumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Please Enters Starting number as a '1':");
        int num1= sc.nextInt();
        System.out.println(" Please Enter Ending number as a '20':");
        int num2= sc.nextInt();
        int sum=0;

        if(num1<=20 && num2<=20)
        {
            for(int i=num1;i<=num2;i++)
                sum = sum+i;

            System.out.println("The sum of X ranging from 1 to 20 is:"  + sum);
        }
        else
            System.out.println("One of entered no is not in range of 1-20");
    }
}
