import java.util.Scanner;
public class SwitchCalculator
{
    public static void main(String[] args)
    {
        int sum,subs,div,multi;
        Scanner sc= new Scanner(System.in);
        System.out.println(" Please Enter the First number: ");
        int num1= sc.nextInt();
        System.out.println(" Please Enter the Second number: ");
        int num2=sc.nextInt();
        System.out.println("please Enter any Symbol(+,-,*,/):");
        char symbol=sc.next().charAt(0);
        switch (symbol)
        {
                case '+':
                sum=num1+num2;
                System.out.println("The Addition of two number is:" + sum);
                break;
                case '-':
                subs=num1-num2;
                System.out.println("The Subscracttion  of two number is:" + subs);
                break;
                case '*':
                    multi=num1*num2;
                    System.out.println("The Multiple of two number is:" + multi);
                break;
                case '/':
                div=num1/num2;
                System.out.println("The Divison of two number is:" + div);
                break;
        }


    }}
