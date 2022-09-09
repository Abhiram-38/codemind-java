import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,res=0,d;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp=n;
        while(n!=0)
        {
            d=n%10;
            res=res*10+d;
            n=n/10;
        }
        if(res==temp){
            System.out.println("2");
        }
        else{
            System.out.println("1");
        }
    }
}