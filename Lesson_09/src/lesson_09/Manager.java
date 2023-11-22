package lesson_09;

public class Manager extends Employee implements CalculateSalary {

	private double bonus;

	public Manager(String name, int post, double salary, double bonus) {
		super(name, post, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double calculateSalary() {
		return this.getSalary() + this.getBonus();
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("Bonus: %.2f\n", bonus); 
	}
	
}
