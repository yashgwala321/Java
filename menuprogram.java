import java.util.Scanner;
public class menuprogram{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String arr[][]=new String[1][4];
    while(true)
    {
        System.out.println("1. Add Data");
        System.out.println("2. Show all Data");
        System.out.println("3. Search Data");
        System.out.println("4. Delete Data");
        System.out.println("5. Exit");
        System.out.println("Enter your choice :-  ");
        int choice;
        choice=sc.nextInt();
        switch (choice) {
            case 1: 
            for (int i=0;i<arr.length;i++ ) 
            {   
                System.out.print("Enter Staff Name :- ");
                arr[i][0]=sc.next();
                System.out.print("Enter Staff ID :- ");
                arr[i][1]=sc.next();
                System.out.print("Enter Staff Dept :- ");
                arr[i][2]=sc.next();
                System.out.print("Enter Staff Salary :- ");
                arr[i][3]=sc.next();
        
            }               
            break;
            case 2:
                for(int i=0;i<1; i++)
                {
                    System.out.println("Staff Name is :- "+arr[i][0]);
                    System.out.println("Staff Id is :- "+arr[i][1]);
                    System.out.println("Staff Dept is :- "+arr[i][2]);
                    System.out.println("Staff Salary is :-"+arr[i][3]);
                }
            break;
            case 3:
                System.out.print("Enter Staff id other name to Search:- ");
                String src=sc.next();
                 for(int i=0;i<1; i++)
                {
                    if(arr[i][1].equals(src)|| arr[i][0].equals(src))
                    {
                       for (int j=0;j<1 ;j++ )
                        {
                            System.out.println("Staff Name is :- "+arr[i][0]);
                            System.out.println("Staff Id is :- "+arr[i][1]);
                            System.out.println("Staff Dept is :- "+arr[i][2]);
                            System.out.println("Staff Salary is :-"+arr[i][3]);   
                       }
                    }
                
                    else
                    {
                        System.out.print("Staff not Found");
                    }
                }
            break;


            case 5:
                System.exit(0);
                break;
        }

    }   
  }
}