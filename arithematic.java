
package Arithmetic;
import java.util.*;
interface calc
{
	void sum();
}
public class addition implements calc
{
	int a,b;
	Scanner s=new Scanner(System.in);
	public void sum()
	{
		System.out.println("Enter the first number:");
		a=s.nextInt();
		System.out.println("Enter the second number:");
		b=s.nextInt();
		System.out.println("Sum of two number="+(a+b));
	}
}




interface calc
{
	void sub();
}
public class subtraction implements calc
{
	int a,b;
	Scanner s=new Scanner(System.in);
	public void sub()
	{
		System.out.println("Enter the first number:");
		a=s.nextInt();
		System.out.println("Enter the second number:");
		b=s.nextInt();
		System.out.println("Difference of two number="+(a-b));
	}
}





interface calc
{
	void pro();
}
public class multi implements calc
{
	int a,b;
	Scanner s=new Scanner(System.in);
	public void pro()
	{
		System.out.println("Enter the first number:");
		a=s.nextInt();
		System.out.println("Enter the second number:");
		b=s.nextInt();
		System.out.println("product of two number="+(a*b));
	}
}

interface calc
{
	void quo();
}
public class division implements calc
{
	int a,b;
	Scanner s=new Scanner(System.in);
	public void quo()
	{
		System.out.println("Enter the first number:");
		a=s.nextInt();
		System.out.println("Enter the second number:");
		b=s.nextInt();
		System.out.println("quotient of two number="+(a/b));
	}
}


class packs
{
	public static void main(String args[])
	{
		addition a=new addition();
		subtraction s=new subtraction();
		multi m=new multi();
		division d=new division();
		a.sum();
		s.sub();
		m.pro();
		d.quo();
	}
}
