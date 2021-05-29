

public class Employee {
	private int id;
	private String name;
	private double marks;
	
	public Employee() {
		System.out.println("Default Constructor");
	}
	public Employee(int id) {
		this.id=id;
		System.out.println("Employee(int id)");
		
	}
	public Employee(String name) {
		this.name=name;
		System.out.println("Employee(String name)");
		
	}
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Employee(int id, String name)");
	}
	public void setMarks(double tmp) {
		marks = tmp;
	}

	public double getMarks() {
		return marks;
	}

	public Employee(String name, int id) {
		this.id = id;
		this.name = name;
		System.out.println("Check Employee(int id, String name)");
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setName(String name)");
	}

	void show() {
		System.out.println("Employee id:" + id + " Employee name:" + name);
	}

	

}
