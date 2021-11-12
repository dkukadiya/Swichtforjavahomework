import java.util.Scanner;
public class Printnumber 
{
    public static void main(String[] args)
    {
        Scanner sc;
        int number1,number2;

        System.out.println("Please enter Starting range number : ");
        sc=new Scanner(System.in);
        number1=sc.nextInt();

        System.out.println("please enter Ending range number : ");
        sc=new Scanner(System.in);
        number2=sc.nextInt();

        if(number1+10 == number2)
        {
            for(int i=number1;i<=number2;i++)
                System.out.println("Range of number:" + i);
        }
        else
            System.out.println("The input number is out of range ");
      }
}
