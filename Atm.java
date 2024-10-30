package ATMInterface;
import java.util.*;

public class Atm implements ATM_Interfer{
	static int tot=0;
	public void deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount for deposit:");
		int dep=sc.nextInt();
		if(dep<1000)
		{
			System.out.println("Sorry!!You need deposit more than 500!!");
		}
		tot+=dep;
	}
	public void withdrawl()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount for withdrawl:");
		int dep=sc.nextInt();
		int ch=check_balance();
		if(ch>1000)
		{
			if(dep>ch)
			  System.out.println("Your Withdrawl Amount Is Greater Than The Balance Amount!!");				 
			else
			{
			tot-=dep;
			if(tot<1000)
			  System.out.println("It reaches the minimum limit!!");
			}
		}
		
	}
	public int check_balance()
	{
		return tot;
	}
	
	public static void main(String[]args)
	{
		Atm ab=new Atm();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Welcome to Our ATM!!!  \nInsert Your ATM Card ");
	 System.out.println("1]DEPOSIT               \n2]WITHDRAWAL         //WithDraw Minimum Rs.500");
	 System.out.println("3]CHECK BALANCE      \n4]EXIT");
	 System.out.println();
	 boolean last=true;
	 
	 while(last)
	 {
       System.out.print("Enter the Number to choose the option:" );
       int a=sc.nextInt();
	 switch(a)
	 {
	 case 1:
		 ab.deposit();
		 break;
	 case 2:
	 ab.withdrawl();
		 break;
	 case 3:
		 System.out.println("The Balance Amount is:"+ab.check_balance());
		 break;
	 case 4:
		 last=false;
		 break;
	 }
	 }
     System.out.println("Thank You!!");
     
	}
	
}