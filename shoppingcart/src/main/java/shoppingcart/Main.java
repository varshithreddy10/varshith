package shoppingcart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring-beans.xml");
		ShoppingKart sk=ctxt.getBean(ShoppingKart.class);
		sk.checkout();
	}

}
