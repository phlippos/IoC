package IoCLearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;
 

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		rent rn = (rent)context.getBean("rent1");
		
		
		System.out.println("\nKiralamalar  -------------\n");
		
		rn.rentInfos();
		context.close();
	}
}
