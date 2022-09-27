import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int e=0,o=0;
        while(n!=0)
        {
            int d=n%10;
            if(d%2==0)
                e++;
            else
                o++;
            n=n/10;
        }
        if(e>0 && o==0)
            System.out.println("Even");
        else if(o>0 && e==0)
            System.out.println("Odd");
        else
            System.out.println("Mixed");
    }
}
