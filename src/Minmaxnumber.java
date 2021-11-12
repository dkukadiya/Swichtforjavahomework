import java.util.Scanner;
public class Minmaxnumber
{
    public static void main(String[] args)
    {
        //int num1,num2,num3;
        Scanner sc;
        System.out.println("Enter first number:");
        sc = new Scanner(System.in);
        int  num1=sc.nextInt();
        System.out.println("Enter second  number:");
        sc= new Scanner(System.in);
        int  num2=sc.nextInt();
        System.out.println("Enter third number:");
        sc= new Scanner(System.in);
        int  num3=sc.nextInt();

        if(num1>num2 && num1>num3)
            System.out.println("The Maximum  number is:  " + num1);
        else if(num2>num1 && num2>num3)
            System.out.println("The Maximum  number is:  " + num2);
        else if(num3>num1 && num3>num1)
            System.out.println("The Maximum  number is:  " + num3);

        if(num1<num2 && num1<num3)
            System.out.println("The Minimum  number is:  " + num1);
        else if(num2<num1 && num2<num3)
            System.out.println("The Minimum  number is:  " + num2);
        else if(num3<num1 && num3<num1)
            System.out.println("The Minimum  number is:  " + num3);
    }
}
