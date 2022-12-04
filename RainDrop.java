import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        if(n%3==0)
        {
            System.out.print("Pling");
            x=1;
        }
        if(n%5==0)
        {
            System.out.print("Plang");
            x=1;
        }
        if(n%7==0)
        {
            System.out.print("Plong");
            x=1;
        }
        if(x==0)
            System.out.println(n);
    }
}