import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int c1=0,c2=0,c3=0;
        if(a>50)
            c1++;
        if(b>60)
            c2++;
        if(c>100)
            c3++;
        if(c1==1 && c2==1 && c3==1)
            System.out.println(10);
        else if(c1==1 && c2==1 && c3!=1)
            System.out.println(9);
        else if(c1!=1 && c2==1 && c3==1)
            System.out.println(8);
        else if(c1==1 && c2!=1 && c3==1)
            System.out.println(7);
        else if(c1==1 || c2==1 || c3==1)
            System.out.println(6);
        else
            System.out.println(5);
        
    }
}
