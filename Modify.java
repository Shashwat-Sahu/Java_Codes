import java.util.*;
public class Modify{
public static void main (String[] arg) {
Scanner c=new Scanner(System.in);
int x=c.nextInt();
int num=x;
int count=0;
while(x!=0)
{
	x=x/10;
	count++;
}
int s=0;
for(int i=count;i>1;i--)
{
	int r,p,m;
	r=(int)(num/Math.pow(10,i-1));
	num=(num%(int)Math.pow(10,i-1));
	p=(int)(num/Math.pow(10,i-2));
	m=Math.abs(r-p);
s=s*10+m;	
}

System.out.println(s);
}
}
