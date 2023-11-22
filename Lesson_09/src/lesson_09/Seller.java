package lesson_09;

public class Seller extends Employee implements CalculateSalary {

	private double comission;
	
	
	public Seller(String name, int post, double salary, double comission) {
		super(name, post, salary);
		this.comission = comission;
	}

	public double getComission() {
		return comission;
	}

	public void setComission(double comission) {
		this.comission = comission;
	}

	@Override
	public double calculateSalary() {
		return (this.getComission() * this.getSalary()) + this.getSalary();
	}

	@Override
	public String toString() {
		return super.toString() + String.format("Comission: %.2f\n", comission); 
	}


}
