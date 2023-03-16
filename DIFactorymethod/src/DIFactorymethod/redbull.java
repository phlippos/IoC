package DIFactorymethod;

public class redbull implements ICars{
	private  IDriver driver;
	private  int power;
	private  String engineSize;
	private  String engineName;
	private static final redbull rb = new redbull();
	
	
	private redbull() {}
	
	
	//Factory method singleton pattern
	public static redbull getrb() {
		return rb;
	}


	//Setter injection

	public void setDriver(IDriver driver) {
		//redbull.driver = driver;
		this.driver = driver;
	}




	public void setPower(int power) {
		this.power = power;
	}




	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}




	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}




	@Override
	public  void engineInfos() {
		
		System.out.println("Engine name : "+  this.engineName + "\nsize : " + this.engineSize + "\npower : "+ this.power);
	}
	
	@Override
	public void driverInfos() {
		this.driver.display();
	}
}
