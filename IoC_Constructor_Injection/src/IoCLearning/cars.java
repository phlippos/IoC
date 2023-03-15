package IoCLearning;

public class cars {
	private static int x=0;
	private int auto_id;
	public String mark;
	public String model;
	public String power;
	public String year;
	public String plate;
	public float price;
	private boolean status = true;
	
	public cars(String mark,String model,String power,String year,String plate,float price) {
		auto_id = x;
		x++;
		this.mark = mark;
		this.model = model;
		this.power = power;
		this.year = year;
		this.plate = plate;
		this.price = price;
	}
	
	public int getAuto_id(){
		return this.auto_id;
	}
	public void getCar(){
		System.out.println("------------------car----------------");
		System.out.println("Marka : "+ this.mark +"\nmodel : "+this.model+"\nyıl : "+this.year);
	}
}
