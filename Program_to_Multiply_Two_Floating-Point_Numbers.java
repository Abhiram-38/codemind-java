import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=a*b;
        System.out.format("%.2f",c);
    }
}
