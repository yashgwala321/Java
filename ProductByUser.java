
class ProductDetail 
{
	private int id;
	private String name;
	private String brand;
	private int rate;
	private int qty;
	private int result;
	
	public void setId (int pid)  // Single Mutator Method 
	{
		id = pid;
	}
	
	public void setName(String pname)   // Single Mutator Method 
	{
		name = pname;
	}
	
	public void setBrand(String pbrand)    // Single Mutator Method
	{
		brand = pbrand;
	}
	
	public void setRate(int prate)    // Single Mutator Method
	{
		if(prate>10)
		{
			rate = prate;
		}	
	}
	
	public void setQty(int pqty)   //Mutator Method
	{
		qty = pqty; 
	}
	
	public void settotal()
	{
		result = rate*qty;
	}
	
	public void setData(int pid ,String pname ,String pbrand, int prate ,int pqty)  // Multiple Mutator Method
	{
		id = pid;
		name = pname;
		brand = pbrand;
		rate = prate;
		qty= pqty;
	}
	
	public void display()
	{
		System.out.println("****Product Details****");
		System.out.println("Product ID :- " + id);
		System.out.println("Product Name :- " + name);
		System.out.println("Product Brand :- " + brand);
		System.out.println("Product Price :- " + rate);
		System.out.println("Product Total Price :- " + result);
		System.out.println("Product Quentety :- " + qty);		
	}
}

public class ProductByUser
{
		public static void main (String[] args)
		{
			Scanner sc = new Scanner (System.in);
			ProductDetail obj = new ProductDetail();
			System.out.println("Enter ID:- ");
			int i = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Product Name:- ");
			String n = sc.nextLine();
			sc.nextLine();
			
			System.out.println("Enter Product Brand:- ");
			String bn = sc.nextLine();
			sc.nextLine();
			
			
			obj.setId();
			obj.setName();
			obj.setBrand();
			obj.setRate();
			obj.setQty();
			obj.settotal();
			obj.display();
		}
}

