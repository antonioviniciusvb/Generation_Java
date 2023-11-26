package pharmacy.controller;

import java.util.ArrayList;
import java.util.Optional;

import pharmacy.model.Product;
import pharmacy.repository.ProductRepository;
import pharmacy.util.OutPut;

public class ProductController implements ProductRepository {

	private ArrayList<Product> products = new ArrayList<Product>();
	private int id;
	public String errorOperation = "Product Id not found";

	@Override
	public void register(Product product) {

		products.add(product);
		OutPut.printSucess("Product registered successfully.");
	}

	@Override
	public void listAll() {

		if (products.isEmpty())
			OutPut.printFailed("There are no registered products");
		else
			products.forEach(p -> OutPut.printfSucess(p.toString()));
	}

	@Override
	public void findById(int productId) {

		var product = findProduct(productId);

		if (product.isPresent())
			OutPut.printSucess(product.get().toString());
		else
			OutPut.printFailed(errorOperation);
	}

	@Override
	public void delete(int productId) {
		
		var productToDelete = findProduct(productId);
		
		if(productToDelete.isPresent()) {
			products.remove(productToDelete.get());
			OutPut.printfSucess("Product Id: %d successfully removed", productId);
		}else {
			OutPut.printFailed(errorOperation);
		}
	}

	@Override
	public void update(Optional<Product> product) {

		var productToUpdate = findProduct(product.get().getId());
		
		if (productToUpdate.isPresent()) {
			products.set(products.indexOf(productToUpdate.get()), product.get());
			OutPut.printfSucess("Product %s updated successfully", product.get().getName());
		} else {
			OutPut.printFailed(errorOperation);
		}
	}

	public Optional<Product> findProduct(int id) {

		for (Product product : products)
			if (product.getId() == id)
				return Optional.of(product);

		return Optional.empty();
	}

	public int generateId() {
		return ++id;
	}
}
