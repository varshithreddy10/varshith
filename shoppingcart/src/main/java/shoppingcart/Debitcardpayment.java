package shoppingcart;

public class Debitcardpayment implements Ipayment
{
	   public Debitcardpayment()
	   {
		   System.out.println("Debitcardpayment  ::  constructor executed");
	   }
	   public boolean pay(double amt)
	   {
		   System.out.println("Debitcardpayment executed\nyour bill is = "+amt);
		   return true;
	   }
}
