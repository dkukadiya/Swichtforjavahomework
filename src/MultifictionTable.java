import java.util.Scanner;
public class MultifictionTable
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Java Program to Print Table of a Number");
        System.out.println(" Please Enter Any Number: ");
        int number = sc.nextInt();
        for (int i = 1; i <= 12; i++)
        {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
