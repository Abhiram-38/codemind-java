import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int s=0;
        for(int i=a;i<=b;i++)
        {
            if(i%c==0)
                s+=1;
        }
        System.out.println(s);
    }
}
