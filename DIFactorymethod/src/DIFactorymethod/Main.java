package DIFactorymethod;


import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Redbull");
		
		ICars car = context.getBean("rb1",ICars.class);
		
		
		car.engineInfos();
		car.driverInfos();
		
		
	}
}
