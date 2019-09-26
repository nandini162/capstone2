import pack1.*;
import java.util.*;
public class cal{
	public static void main(String args[])
	{
		int x,y,n,ans=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value1:");
		x=sc.nextInt();
		System.out.println("Enter the value2:");
		y=sc.nextInt();
		System.out.println("Menu:\n 1) Addition\n 2)Subtract\n 3) multiply\n 4)Divide\n");
		System.out.println("Select choice from menu(1/2/3/4):");
		n=sc.nextInt();
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
		
				

		
