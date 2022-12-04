import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.println(n);
        if(n<1 || n>12)
            System.out.println("-1");
        if(n==2 || n==3)
            System.out.println("Spring");
        if(n==4 || n==5 || n==6)
            System.out.println("Summer");
        if(n==7 || n==8 || n==9 || n==10)
            System.out.println("Rainy");
        if(n==11 || n==12 || n==1)
            System.out.println("Winter");
    }
}