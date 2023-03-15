package IoCLearning;

import java.util.HashMap;
import java.util.List;

public class employee {
	private String name;
	private List<address> addressE;
	private List<String> children;

	public employee(List<address> addressE ) {//Dependency injection by constructor
		this.addressE = addressE;
	}
	public employee(List<address> addressE,List<String> children) {
		this.addressE = addressE;
		this.children = children;
		
	}
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void displayInfo(){
		System.out.println("Hello " + name);
		
		addressE.forEach(
				(x)->{
					System.out.println("adres : ");
					x.getAddress();
				});
		
		if(children.size()>0) {
			System.out.println("Çocuklar : ");
			children.forEach(
					(n)->{
						System.out.println("\t"+n);
					});
			
		}
	}
}
