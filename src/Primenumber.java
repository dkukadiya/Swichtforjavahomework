import java.util.Scanner;
public class Primenumber
{
    public static void main(String[] args)
    {
         int num,n=1; //variable declaration

         System.out.println("Enter the any number:");
         Scanner sc=new Scanner(System.in);
         num=sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
                n=n*i;
        }

        if(n==num)
            System.out.println("This is a Prime number");
        else
            System.out.println("This is not  Prime number");
    }
}

