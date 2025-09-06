package firstproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args)
	{
		//start the ioc container
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("spring-beans.xml");
		Engine e=ctxt.getBean(Engine.class);
		System.out.println("the value of a + b  = "+e.hello());
	}

}
