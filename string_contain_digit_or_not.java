import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int x=0;
		for(int i=0;i<s.length();i++)
		{
		    char ch=s.charAt(i);
		    if(Character.isDigit(ch))
		        x++;
		}
		if(x>0)
		    System.out.println("Contains"+" "+x+" "+"digit");
		else
		    System.out.println("Doesn't"+" "+"contain"+" "+"digit");
    }   
    
}