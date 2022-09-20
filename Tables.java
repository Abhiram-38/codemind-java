import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int x=sc.nextInt();
        for(int i=1;i<=x;i+=2)
        {
            System.out.println(n+" "+'x'+" "+i+" "+'='+" "+n*i);
        }
    }
}