package shoppingcart;

import java.util.Scanner;

public class ShoppingKart 
{
	Ipayment payref;
//	public ShoppingKart()
//	{
//		
//	}

	public ShoppingKart(Ipayment payref)  // constructor injection
	{
		this.payref=payref;
	}
	
	public void setPayment(Ipayment payref)
	{
		this.payref=payref;
	}
	
	public int items()
	{
		System.out.println("total");
		Scanner sc=new Scanner(System.in);

        // Display available items
        System.out.println("===== ITEM MENU =====");
        System.out.println("1. Pen         - ₹25.50");
        System.out.println("2. Notebook    - ₹40.00");
        System.out.println("3. Eraser      - ₹15.75");
        System.out.println("4. Geometry Box - ₹60.25");
        System.out.println("5. Backpack    - ₹100.00");
        System.out.println("======================");

        // Get input from user
        System.out.print("Enter item number (1 to 5): ");
        int itemNumber = sc.nextInt();

        // Switch case to get item price
        switch (itemNumber) {
            case 1:
                return 25;
                
            case 2:
                return 40;
                
            case 3:
                System.out.println("You selected Eraser. Price is ₹15.75");
                break;
            case 4:
                return 15;
                
            case 5:
                return 60;
                
            default:
                System.out.println("Invalid item number. Please enter a number between 1 and 5.");
        }

        sc.close();
		
		return 10;
	}
	public void checkout()
	{
		int price=items();
		boolean status=payref.pay(price);
		if(status)
		{
			System.out.println("your payment is completed");
		}
		else
		{
			System.out.println("your payment is failed");
		}
	}

}
