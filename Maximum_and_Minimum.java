import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>a=new ArrayList<>();
        ArrayList<Integer>ar=new ArrayList<>();
        HashSet<Integer> arr=new HashSet<>();
        boolean x=false;
        for (int i=0;i<n;i++)
        {
            int b=sc.nextInt();
            a.add(b);
            arr.add(b);
        }
        for (int ele:arr)
        {
            if (Collections.frequency(a,ele)==ele)
            {
               ar.add(ele); 
               x=true;
            }
        }
        if(x==true)
        {
        System.out.print(Collections.min(ar)+" ");
        System.out.print(Collections.max(ar));
        }
        else
            System.out.println("-1");
    }
}