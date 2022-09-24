import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res1=0,res2=1;
		while(n!=0)
		{
		    int d=n%10;
		    res1+=d;
		    res2*=d;
		    n=n/10;
		}
		System.out.println(res2-res1);
        
    }
}
