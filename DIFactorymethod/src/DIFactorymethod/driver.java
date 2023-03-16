package DIFactorymethod;

public class driver implements IDriver{
	private int id;
	private String name;
	private String surname;
	private int age;
	
	public driver(int id) {
		this.id = id;
	}
	public driver(int id,String name,String surname,int age) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	@Override
	public void display() {
		System.out.println("Name : "+this.name+"\nSurname : "+this.surname+"\nAge : "+this.age);
		
	}
}
