package pharmacy;

import java.util.Optional;

import pharmacy.controller.ProductController;
import pharmacy.model.Cosmetic;
import pharmacy.model.Medicine;
import pharmacy.model.Product;
import pharmacy.util.Colors;
import pharmacy.util.Input;
import pharmacy.util.OutPut;

public class Menu {

	public static String optionsMenuMain = "o--------------------------------------------------o\n"
			+ "|-------------- PHARMACY GENERATION  --------------|\n"
			+ "o--------------------------------------------------o\n"
			+ "|            1- Create Product                     |\n"
			+ "|            2- List All Products                  |\n"
			+ "|            3- Find Product by id                 |\n"
			+ "|            4- Update Data of Product             |\n"
			+ "|            5- Delete Product                     |\n"
			+ "|                                                  |\n"
			+ "|--------------------------------------------------|\n"
			+ "|--------------------------------------------------|\n"
			+ "|            9- Exit                               |\n"
			+ "o--------------------------------------------------o\n"
			+ "| Select the desired option:                       |\n"
			+ "o--------------------------------------------------o";

	public static ProductController productsController = new ProductController();

	public static void main(String[] args) {

		int option;

		do {

			showOptionsMain();
			option = Input.getInteger("");
			System.out.println();

			showOperation(option);

			switch (option) {

			case 1 -> productsController.register(createProduct(0, 0));

			case 2 -> productsController.listAll();

			case 3 -> productsController.findById(Input.getInteger("Product Id to search:"));

			case 4 -> {
				var product = productsController.findProduct(Input.getInteger("Enter Product Id to update:"));

				if (product.isPresent())
					productsController
							.update(Optional.of(createProduct(product.get().getId(), product.get().getType())));
				else
					OutPut.printFailed(productsController.errorOperation);
			}

			case 5 -> productsController.delete(Input.getInteger("Enter Product Id to delete:"));

			}

			Input.systemPause();

		} while (continueLoop(option));

		showAboutProgram();
	}

	public static boolean continueLoop(int option) {
		return option != 9;
	}

	private static Product createProduct(int productId, int productType) {

		int id, type;
		String name, generic, fragrance;
		double price = 0.0d;

		id = defineProductId(productId);
		type = defineProductType(productType);

		name = Input.getString("Enter the name of the Product:");

		price = Input.getDouble("Enter the Product price:");

		if (type == 0)
			type = Input.getInteger("1- Medicine\n2- Cosmetic\nChoose Product option:");

		if (type == 1) {

			generic = Input.getString("Enter the generic name:");
			return new Medicine(id, name, type, price, generic);
		} else {
			fragrance = Input.getString("Enter with the fragrance:");

			return new Cosmetic(id, name, type, price, fragrance);
		}
	}

	private static int defineProductType(int productType) {
		return productType == 1 || productType == 2 ? productType : 0;
	}

	private static int defineProductId(int productId) {
		return productId > 0 ? productId : productsController.generateId();
	}

	public static void showOperation(int operation) {

		var menu = optionsMenuMain.split("\n");

		System.out.println(Colors.theme + menu[0] + "\n" + menu[2 + operation] + "\n" + menu[2]);
	}

	public static void showOptionsMain() {
		System.out.println(Colors.theme + optionsMenuMain);
		System.out.printf(Colors.TEXT_RESET);
	}

	public static void showAboutProgram() {
		System.out.println(Colors.theme + "o-------------------------------------------------------o");
		System.out.println("| Project: Pharmacy                                     |");
		System.out.println("| https://github.com/antonioviniciusvb/Bank_Account.git |");
		System.out.println("| Developed by: Antonio Bandeira                        |");
		System.out.println("| Generation Brasil - generation@generation.org         |");
		System.out.println("o-------------------------------------------------------o");
	}

}
