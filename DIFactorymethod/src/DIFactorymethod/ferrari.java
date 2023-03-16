package DIFactorymethod;

public class ferrari implements ICars{
	private static IDriver driver;
	private static int power;
	private static String engineSize;
	private static String engineName;
	private static final ferrari fr = new ferrari();
	
	
	
	

	//Factory method singleton pattern
	private ferrari() {
		
	}
	public static ferrari getfr() {
		return fr;
	}




	public void setDriver(IDriver driver) {
		ferrari.driver = driver;
	}




	public void setPower(int power) {
		ferrari.power = power;
	}




	public void setEngineSize(String engineSize) {
		ferrari.engineSize = engineSize;
	}




	public void setEngineName(String engineName) {
		ferrari.engineName = engineName;
	}

	@Override
	public void engineInfos() {
		System.out.println("Engine name : "+ ferrari.engineName + "\nsize : " + ferrari.engineSize + "power : "+ ferrari.power);
		
	}
	
	
	@Override
	public void driverInfos() {
		ferrari.driver.display();
	}
	
}
