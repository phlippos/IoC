package IoCLearning;

import java.util.HashMap;

public class rent {
	private HashMap<cars,customer> rentMap;
	
	public rent(HashMap<cars,customer> rentMap) {
		this.rentMap = rentMap;
	}
	
	public void rentInfos() {
		rentMap.forEach(
				(c,cu)->{
					System.out.println("--------------kiralama----------------");
					System.out.println("araç id : "+c.getAuto_id() + "\nKiralayan :"+cu.name );
					System.out.println("Araç ve kiralayan bilgileri altta detaylı olarak verildi :  ");
					cu.getCustomer();
					c.getCar();
					System.out.println("-------------------------------------");
					
				}
				);
		
	}
}
