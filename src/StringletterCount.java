import java.util.Scanner;
public class StringletterCount
{
    public static void main(String[] args)
    {
        String name;
        System.out.print("Please enter any Name:");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        System.out.println("Your entered name :" + name);

        int countA=0;
        for(int i=0; i< name.length();i++)
        {
            if(name.charAt(i)=='a' || name.charAt(i)=='A')
                countA++;
        }
        System.out.println("No of A and a letter found:  "  + countA);
    }
}
