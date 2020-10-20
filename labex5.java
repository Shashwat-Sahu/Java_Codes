import java.util.*;
class labex5 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(); 
        
        int sum=0;
        for(int i=1;i<=x;i++)
        {
            if(i%3==0 || i%5==0)
            sum=sum+i;
        }
        System.out.println(sum);
    }
    
}
