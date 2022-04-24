import java.util.Scanner;
class Fibanocci
{
	public static void main(String args[])
	{
		int a=0,b=1,count=3,n,res;
		System.out.println(a,b);
		System.out.println("Enter n value");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(count<=n)
		{
			res=a+b;
			System.out.println(res);
			a=b;
			count=count+1;
		}
	}
}
		