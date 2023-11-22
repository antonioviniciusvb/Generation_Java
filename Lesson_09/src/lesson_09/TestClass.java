package lesson_09;

public class TestClass {

	public static void main(String[] args) {
		
		Manager antonio = new Manager("Antonio", 1, 10000d, 500d);
		Seller carlos = new Seller("Carlos", 2, 5000d, 0.10d);
		
		System.out.println(antonio);
		System.out.println("Antonio Salary: " + antonio.calculateSalary());
		System.out.println();
		
		System.out.println(carlos);
		System.out.println("Carlos Salary: " + carlos.calculateSalary());

	}

}
