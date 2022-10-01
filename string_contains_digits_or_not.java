import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
		    sc.nextLine();
		    String s=sc.next();
    		int x=0;
    		for(int i=0;i<s.length();i++)
    		{
    		    char ch=s.charAt(i);
    		    if(Character.isDigit(ch))
    		    {
    		        System.out.println("Yes");
    		        x=1;
    		        break;
    		    }
    		}
    		if(x==0)
    		    System.out.println("No");
		}
    }   
    
}