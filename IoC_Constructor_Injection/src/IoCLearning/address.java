package IoCLearning;

public class address {
	private String city;
	private String hausaddress;
	private String postalcode;
	
	
	public address(String city) {
		this.city = city;
	}
	
	public address(String city,String hausaddress){
		this.city  = city;
		this.hausaddress = hausaddress;
	}
	public address(String city,String hausaddress,String postalcode ) {
		this.city  = city;
		this.hausaddress = hausaddress;
		this.postalcode = postalcode;
	}
	
	
	public void getAddress() {
		System.out.println("Şehir : "+ this.city +"\nadres : "+ this.hausaddress+"\nposta kodu : "+this.postalcode);
	}
}
