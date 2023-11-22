package lesson_09;

public abstract class Employee {

	private String name;
	private int post;
	private double salary;

	public Employee(String name, int post, double salary) {
		this.name = name;
		this.post = post;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPost() {
		return post;
	}

	public void setPost(int post) {
		this.post = post;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s\nPost:%d\nSalary: %.2f\n", name, post, salary);
	}

}
