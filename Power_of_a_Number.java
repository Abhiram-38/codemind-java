import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        int b=sc.nextInt();
        int x=sc.nextInt();
        System.out.println((int)(Math.pow(a,b))%x);
    }
}
