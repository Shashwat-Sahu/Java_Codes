import java.util.*;
class lab4ex {
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
        for(i=2;i<=n;i++)
        {
            int j;
            for(j=2;j<i;j++)
            {
            if(i%j==0)
            break;
            }
            if(j>=i)
            {
                System.out.println(i);
            }
        }
    }
}
