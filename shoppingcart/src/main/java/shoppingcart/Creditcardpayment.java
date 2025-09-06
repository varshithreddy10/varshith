package shoppingcart;

public class Creditcardpayment implements Ipayment
{
   public Creditcardpayment()
   {
	   System.out.println("Creditcardpayment  ::  constructor executed");
   }
   public boolean pay(double amt)
   {
	   System.out.println("creditcardpayment executed\nyour bill is = "+amt);
	   return true;
   }
}
