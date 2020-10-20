import java.util.*;
class doselectlab1_4
{
    public static boolean check (int n)
    {
        double y=(Math.log(n)/Math.log(2));
        if(Math.ceil(y)==Math.floor(y))
        return true;
        else 
        return false; 
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        boolean w=check(x);
        System.out.println(w);
    }
}