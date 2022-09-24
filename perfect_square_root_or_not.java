import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=(int)Math.sqrt(n);
        if(x*x==n)
            System.out.println("True");
        else
            System.out.println("False");
    }
}