import java.util.*; 
import java.lang.*; 
class labex1
{ 
  
    /* Returns the sum of series */
    public static int sumOfSeries(int n) 
    { 
        int sum = 0; 
        for (int x=1; x<=n; x++) 
            sum =sum+ (x*x*x); 
        return sum; 
    } 
  
// Driver Function 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(); 
        System.out.println(sumOfSeries(x)); 
  
    } 
} 