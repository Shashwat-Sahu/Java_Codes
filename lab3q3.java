import java.util.*;
public class lab3q3 {
public static void main(String[] arg)
{
	Scanner c=new Scanner(System.in);
	String s=c.next();
	for(int i=0;i<s.length();i++)
	{
		char p=s.charAt(i);
		if(p!='a'&&p!='e'&&p!='i'&&p!='o'&&p!='u'&&p!='A'&&p!='E'&&p!='I'&&p!='O'&&p!='U')
		{
			if(p=='z')
				p='a';
			else if(p=='Z')
				p='A';
			else
				p++;
		s=s.substring(0,i)+p+s.substring(i+1);
		}
	}
	System.out.println(s);
}
}ZA
