import java.util.*;
class SumDigits{
	public static void main(String[] args){
		int num,sum=0,rev;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any positive number:");
		num=sc.nextInt();
		while(num>0)
		{
			rev=num%10;
			sum=sum+rev;
			num=num/10;
		}
		System.out.println("sum of digits:"+sum);
	}
}
