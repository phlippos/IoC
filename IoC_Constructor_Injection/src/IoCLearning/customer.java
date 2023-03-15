package IoCLearning;

import java.util.HashMap;

public class customer {
	public String name;
	private address addressC;
	private HashMap<String, String> payment;
	
	public customer(String name,address addressC) {
		this.addressC = addressC;
		this.name = name;
	}
	
	public customer(String name,address addressC,HashMap<String,String> payment) {
		this.addressC = addressC;
		this.name = name;
		this.payment = payment;
	}
	
	public void getCustomer() {
		System.out.println("-------------------------------------");
		System.out.println("Müşterinin adı : "+ name);
		addressC.getAddress();
		System.out.println("-------------------------------------");
		/*if(payment != null ) {
			System.out.println("Ödemeler : ");
			for(String m : this.payment.keySet()) {
				System.out.println(m + "" + payment.get(m));
			}*/
		
	}
}

