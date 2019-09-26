import pack1.*;
import java.util.*;
import java.lang.*;
public class cal{
	public static void main(String args[])
	{
		int x,y,n,ans=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value1:"+args[0]);
		x=Integer.parseInt(args[0]);
		System.out.println("Enter the value2:"+args[1]);
		y=Integer.parseInt(args[1]);
		System.out.println("Menu:\n 1) Addition\n 2)Subtract\n 3) multiply\n 4)Divide\n");
		System.out.println("Select choice from menu(1/2/3/4):"+args[2]);
		n=Integer.parseInt(args[2]);
		switch(n)
		{
			case 1: ans=add.add(x,y);
			break;
			case 2: ans=sub.sub(x,y);
			break;
			case 3: ans=mutiply.multiply(x,y);
			break;
			case 4: ans=divide.divide(x,y);
			break;
		}
		System.out.println("Answer:"+ans);
	}
}
		
				

		
