import java.util.Scanner;
import javax.swing.*;

class Bank
{
	private int accountNo;
	private String name;
	private int balance;
	
	public void accept()
	{
		accountNo = Integer.parseInt(JOptionPane.showInputDialog("Enter Account Number"));
		name = JOptionPane.showInputDialog("Enter Name");
		balance = Integer.parseInt(JOptionPane.showInputDialog("Enter amount which you want to initially deposite"));
	}
	
	public void display()
	{
		System.out.println("Acount num is :" + accountNo);
		System.out.println("Name is:" + name);
		System.out.println("Balance :" + balance);
		System.out.println("-------------");
	}
	
	public void deposite(int amount)
	{
		if(amount>20000){
		  System.out.println("not accepted above 20,000 Amount");
		}
		else{
		  balance = balance + amount;
		}
	}
	
	public void widrow(int amount)
	{
		if(amount<=5000)
		{
		   balance = balance - amount;
		}else{
		  System.out.println("Only 5,000 and less than 5,000 Amount are Withdraw");
		}
	}
}

public class bankAccount
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Bank A = new Bank();
		A.accept();
		System.out.println("Account Delails Are");
		A.display();
		System.out.println("Enter Your Deposite Amount :");
		int amt = sc.nextInt();
		A.deposite(amt);
		System.out.println("Account Delails Are");
		A.display();
		System.out.println("Enter Your Withdraw Amount :");
		int wd = sc.nextInt();
		A.widrow(wd);
		System.out.println("Account Delails Are");
		A.display();
	}
}