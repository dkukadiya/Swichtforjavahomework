import java.util.Scanner;
public class Fibonaccinumber
{
    public static void main(String[] args)
    {
        int n1=0,n2=1,num;

        System.out.print("Enter start any number: ");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();

        for(int i=0; i<num; i++)
        {
            System.out.println(n1);
            int ans=n1+n2;
            n1=n2;
            n2=ans;
        }
    }
}
